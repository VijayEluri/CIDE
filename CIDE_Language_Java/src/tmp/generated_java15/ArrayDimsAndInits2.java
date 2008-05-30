package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class ArrayDimsAndInits2 extends ArrayDimsAndInits {
  public ArrayDimsAndInits2(ArrayList<ASTTextNode> text449, ArrayInitializer arrayInitializer, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOneOrMore<ASTTextNode>("text449", text449),
      new PropertyOne<ArrayInitializer>("arrayInitializer", arrayInitializer)
    }, firstToken, lastToken);
  }
  public ArrayDimsAndInits2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new ArrayDimsAndInits2(cloneProperties(),firstToken,lastToken);
  }
  public ArrayList<ASTTextNode> getText449() {
    return ((PropertyOneOrMore<ASTTextNode>)getProperty("text449")).getValue();
  }
  public ArrayInitializer getArrayInitializer() {
    return ((PropertyOne<ArrayInitializer>)getProperty("arrayInitializer")).getValue();
  }
}
