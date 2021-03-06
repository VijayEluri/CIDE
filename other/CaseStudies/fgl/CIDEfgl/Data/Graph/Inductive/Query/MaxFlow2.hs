module Data.Graph.Inductive.Query.MaxFlow2
       (Network, ekSimple, ekFused, ekList) where
{ import Data.List;
  import Data.Maybe;
  import Data.Graph.Inductive.Graph;
  import Data.Graph.Inductive.Tree;
  import Data.Graph.Inductive.Internal.FiniteMap;
  import Data.Graph.Inductive.Internal.Queue;
  import Data.Graph.Inductive.Query.BFS (bft);
   
  type Network = Gr () (Double, Double);
   
  data Direction = Forward
                 | Backward
                 deriving (Eq, Show);
   
  type DirEdge b = (Node, Node, b, Direction);
   
  type DirPath = [(Node, Direction)];
   
  type DirRTree = [DirPath];
  pathFromDirPath = map (\ (n, _) -> n);
   
  augPathFused :: Network -> Node -> Node -> Maybe DirPath;
  augPathFused g s t
    = listToMaybe $ map reverse $
        filter (\ ((u, _) : _) -> u == t) tree
    where { tree = bftForEK s g};
   
  bftForEK :: Node -> Network -> DirRTree;
  bftForEK v = bfForEK (queuePut [(v, Forward)] mkQueue);
   
  bfForEK :: Queue DirPath -> Network -> DirRTree;
  bfForEK q g
    | queueEmpty q || isEmpty g = []
    | otherwise =
      case match v g of
          { (Nothing, g') -> bfForEK q1 g';
            (Just (preAdj, _, _, sucAdj), g') -> p : bfForEK q2 g'
              where { q2 = queuePutList suc1 $ queuePutList suc2 q1;
                      suc1
                        = [(preNode, Backward) : p | ((_, f), preNode) <- preAdj, f > 0];
                      suc2
                        = [(sucNode, Forward) : p | ((c, f), sucNode) <- sucAdj, c > f]}}
    where { (p@((v, _) : _), q1) = queueGet q};
   
  extractPathFused ::
                     Network -> DirPath -> ([DirEdge (Double, Double)], Network);
  extractPathFused g [] = ([], g);
  extractPathFused g [(_, _)] = ([], g);
  extractPathFused g ((u, _) : rest@((v, Forward) : _))
    = ((u, v, l, Forward) : tailedges, newerg)
    where { (tailedges, newerg) = extractPathFused newg rest;
            Just (l, newg) = extractEdge g u v (\ (c, f) -> (c > f))};
  extractPathFused g ((u, _) : rest@((v, Backward) : _))
    = ((v, u, l, Backward) : tailedges, newerg)
    where { (tailedges, newerg) = extractPathFused newg rest;
            Just (l, newg) = extractEdge g v u (\ (_, f) -> (f > 0))};
  ekFusedStep g s t
    = case maybePath of
          { Just _
              -> Just ((insEdges (integrateDelta es delta) newg), delta);
            Nothing -> Nothing}
    where { maybePath = augPathFused g s t;
            (es, newg) = extractPathFused g (fromJust maybePath);
            delta = minimum $ getPathDeltas es};
   
  ekFused :: Network -> Node -> Node -> (Network, Double);
  ekFused = ekWith ekFusedStep;
   
  residualGraph :: Network -> Gr () Double;
  residualGraph g
    = mkGraph (labNodes g)
        ([(u, v, c - f) | (u, v, (c, f)) <- labEdges g, c > f] ++
           [(v, u, f) | (u, v, (_, f)) <- labEdges g, f > 0]);
   
  augPath :: Network -> Node -> Node -> Maybe Path;
  augPath g s t
    = listToMaybe $ map reverse $ filter (\ (u : _) -> u == t) tree
    where { tree = bft s (residualGraph g)};
   
  extractPath ::
                Network -> Path -> ([DirEdge (Double, Double)], Network);
  extractPath g [] = ([], g);
  extractPath g [_] = ([], g);
  extractPath g (u : v : ws)
    = case fwdExtract of
          { Just (l, newg) -> ((u, v, l, Forward) : tailedges, newerg)
              where { (tailedges, newerg) = extractPath newg (v : ws)};
            Nothing
              -> case revExtract of
                     { Just (l, newg) -> ((v, u, l, Backward) : tailedges, newerg)
                         where { (tailedges, newerg) = extractPath newg (v : ws)};
                       Nothing -> error "extractPath: revExtract == Nothing"}}
    where { fwdExtract = extractEdge g u v (\ (c, f) -> (c > f));
            revExtract = extractEdge g v u (\ (_, f) -> (f > 0))};
   
  extractEdge ::
                Gr a b -> Node -> Node -> (b -> Bool) -> Maybe (b, Gr a b);
  extractEdge g u v p
    = case adj of
          { Just (el, _) -> Just (el, (p', node, l, rest) & newg);
            Nothing -> Nothing}
    where { (Just (p', node, l, s), newg) = match u g;
            (adj, rest)
              = extractAdj s (\ (l', dest) -> (dest == v) && (p l'))};
   
  extractAdj ::
               Adj b -> ((b, Node) -> Bool) -> (Maybe (b, Node), Adj b);
  extractAdj [] _ = (Nothing, []);
  extractAdj (adj : adjs) p
    | p adj = (Just adj, adjs)
    | otherwise = (theone, adj : rest)
    where { (theone, rest) = extractAdj adjs p};
   
  getPathDeltas :: [DirEdge (Double, Double)] -> [Double];
  getPathDeltas [] = [];
  getPathDeltas (e : es)
    = case e of
          { (_, _, (c, f), Forward) -> (c - f) : (getPathDeltas es);
            (_, _, (_, f), Backward) -> f : (getPathDeltas es)};
   
  integrateDelta ::
                   [DirEdge (Double, Double)] -> Double -> [LEdge (Double, Double)];
  integrateDelta [] _ = [];
  integrateDelta (e : es) delta
    = case e of
          { (u, v, (c, f), Forward)
              -> (u, v, (c, f + delta)) : (integrateDelta es delta);
            (u, v, (c, f), Backward)
              -> (u, v, (c, f - delta)) : (integrateDelta es delta)};
   
  type EKStepFunc =
       Network -> Node -> Node -> Maybe (Network, Double);
   
  ekSimpleStep :: EKStepFunc;
  ekSimpleStep g s t
    = case maybePath of
          { Just _
              -> Just ((insEdges (integrateDelta es delta) newg), delta);
            Nothing -> Nothing}
    where { maybePath = augPath g s t;
            (es, newg) = extractPath g (fromJust maybePath);
            delta = minimum $ getPathDeltas es};
   
  ekWith ::
           EKStepFunc -> Network -> Node -> Node -> (Network, Double);
  ekWith stepfunc g s t
    = case stepfunc g s t of
          { Just (newg, delta) -> (finalg, capacity + delta)
              where { (finalg, capacity) = (ekWith stepfunc newg s t)};
            Nothing -> (g, 0)};
   
  ekSimple :: Network -> Node -> Node -> (Network, Double);
  ekSimple = ekWith ekSimpleStep;
   
  setFromList :: (Ord a) => [a] -> FiniteMap a ();
  setFromList [] = emptyFM;
  setFromList (x : xs) = addToFM (setFromList xs) x ();
   
  setContains :: (Ord a) => FiniteMap a () -> a -> Bool;
  setContains m i
    = case (lookupFM m i) of
          { Nothing -> False;
            Just () -> True};
   
  extractPathList ::
                    [LEdge (Double, Double)] ->
                      FiniteMap (Node, Node) () ->
                        ([DirEdge (Double, Double)], [LEdge (Double, Double)]);
  extractPathList [] _ = ([], []);
  extractPathList (edge@(u, v, l@(c, f)) : es) set
    | (c > f) && (setContains set (u, v)) =
      let { (pathrest, notrest)
              = extractPathList es (delFromFM set (u, v))}
        in ((u, v, l, Forward) : pathrest, notrest)
    | (f > 0) && (setContains set (v, u)) =
      let { (pathrest, notrest)
              = extractPathList es (delFromFM set (u, v))}
        in ((u, v, l, Backward) : pathrest, notrest)
    | otherwise =
      let { (pathrest, notrest) = extractPathList es set} in
        (pathrest, edge : notrest);
   
  ekStepList :: EKStepFunc;
  ekStepList g s t
    = case maybePath of
          { Just _ -> Just (mkGraph (labNodes g) newEdges, delta);
            Nothing -> Nothing}
    where { newEdges = (integrateDelta es delta) ++ otheredges;
            maybePath = augPathFused g s t;
            (es, otheredges)
              = extractPathList (labEdges g)
                  (setFromList (zip justPath (tail justPath)));
            delta = minimum $ getPathDeltas es;
            justPath = pathFromDirPath (fromJust maybePath)};
   
  ekList :: Network -> Node -> Node -> (Network, Double);
  ekList = ekWith ekStepList}
