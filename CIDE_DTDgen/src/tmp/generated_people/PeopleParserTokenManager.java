/* Generated By:JavaCC: Do not edit this line. PeopleParserTokenManager.java */
package tmp.generated_people;
import java.io.*;
import java.util.*;
import cide.gast.*;
import cide.gparser.*;
import cide.gparser.*;
public class PeopleParserTokenManager implements PeopleParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_5(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_5(int pos, long active0)
{
   return jjMoveNfa_5(jjStopStringLiteralDfa_5(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_5(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_5(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_5()
{
   switch(curChar)
   {
      case 60:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_5(0x1e800L);
      default :
         return jjMoveNfa_5(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_5(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_5(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa2_5(active0, 0x18000L);
      case 47:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      case 63:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_5(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_5(0, active0);
}
private final int jjMoveStringLiteralDfa2_5(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_5(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_5(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa3_5(active0, 0x8000L);
      case 91:
         return jjMoveStringLiteralDfa3_5(active0, 0x10000L);
      case 120:
         return jjMoveStringLiteralDfa3_5(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_5(1, active0);
}
private final int jjMoveStringLiteralDfa3_5(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_5(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_5(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(3, 15);
         break;
      case 67:
         return jjMoveStringLiteralDfa4_5(active0, 0x10000L);
      case 109:
         return jjMoveStringLiteralDfa4_5(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_5(2, active0);
}
private final int jjMoveStringLiteralDfa4_5(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_5(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_5(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 68:
         return jjMoveStringLiteralDfa5_5(active0, 0x10000L);
      case 108:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(4, 11);
         break;
      default :
         break;
   }
   return jjStartNfa_5(3, active0);
}
private final int jjMoveStringLiteralDfa5_5(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_5(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_5(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa6_5(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_5(4, active0);
}
private final int jjMoveStringLiteralDfa6_5(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_5(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_5(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 84:
         return jjMoveStringLiteralDfa7_5(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_5(5, active0);
}
private final int jjMoveStringLiteralDfa7_5(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_5(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_5(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa8_5(active0, 0x10000L);
      default :
         break;
   }
   return jjStartNfa_5(6, active0);
}
private final int jjMoveStringLiteralDfa8_5(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_5(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_5(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 91:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(8, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_5(7, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_5(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0xefffffffffffffffL & l) == 0L)
                     break;
                  kind = 17;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  kind = 17;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjstateSet[jjnewStateCnt++] = 0;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjStopStringLiteralDfa_3(int pos, long active0)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private final int jjStartNfa_3(int pos, long active0)
{
   return jjMoveNfa_3(jjStopStringLiteralDfa_3(pos, active0), pos + 1);
}
private final int jjStartNfaWithStates_3(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_3(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa1_3(0x10000000L);
      case 61:
         return jjStopAtPos(0, 29);
      case 62:
         return jjStopAtPos(0, 26);
      case 63:
         return jjMoveStringLiteralDfa1_3(0x8000000L);
      default :
         return jjMoveNfa_3(1, 0);
   }
}
private final int jjMoveStringLiteralDfa1_3(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_3(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_3(0, active0);
}
private final int jjMoveNfa_3(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 9;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 24)
                        kind = 24;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(7, 8);
                  else if (curChar == 39)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 0:
                  if ((0x100002600L & l) == 0L)
                     break;
                  if (kind > 24)
                     kind = 24;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff600000000000L & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 3:
                  if (curChar == 39)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 4:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 5:
                  if (curChar == 39 && kind > 30)
                     kind = 30;
                  break;
               case 6:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 7:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 8:
                  if (curChar == 34 && kind > 30)
                     kind = 30;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(2);
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 25)
                     kind = 25;
                  jjCheckNAdd(2);
                  break;
               case 4:
                  jjAddStates(0, 1);
                  break;
               case 7:
                  jjAddStates(2, 3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               case 7:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 9 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 63:
         return jjMoveStringLiteralDfa1_1(0x400000000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(1, 34);
         break;
      default :
         return 2;
   }
   return 2;
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 93:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 93:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      default :
         return 2;
   }
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(2, 36);
         break;
      default :
         return 3;
   }
   return 3;
}
private final int jjMoveStringLiteralDfa0_4()
{
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa1_4(0x200000L);
      case 103:
         return jjMoveStringLiteralDfa1_4(0x400000L);
      case 110:
         return jjMoveStringLiteralDfa1_4(0x100000L);
      case 112:
         return jjMoveStringLiteralDfa1_4(0xc0000L);
      case 115:
         return jjMoveStringLiteralDfa1_4(0x800000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_4(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_4(active0, 0x100000L);
      case 101:
         return jjMoveStringLiteralDfa2_4(active0, 0x4c0000L);
      case 105:
         return jjMoveStringLiteralDfa2_4(active0, 0x200000L);
      case 111:
         return jjMoveStringLiteralDfa2_4(active0, 0x800000L);
      default :
         return 2;
   }
}
private final int jjMoveStringLiteralDfa2_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa3_4(active0, 0x800000L);
      case 109:
         return jjMoveStringLiteralDfa3_4(active0, 0x100000L);
      case 110:
         return jjMoveStringLiteralDfa3_4(active0, 0x400000L);
      case 111:
         return jjMoveStringLiteralDfa3_4(active0, 0x40000L);
      case 114:
         return jjMoveStringLiteralDfa3_4(active0, 0x280000L);
      default :
         return 3;
   }
}
private final int jjMoveStringLiteralDfa3_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa4_4(active0, 0x400000L);
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(3, 20);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_4(active0, 0x800000L);
      case 112:
         return jjMoveStringLiteralDfa4_4(active0, 0x40000L);
      case 115:
         return jjMoveStringLiteralDfa4_4(active0, 0x80000L);
      case 116:
         return jjMoveStringLiteralDfa4_4(active0, 0x200000L);
      default :
         return 4;
   }
   return 4;
}
private final int jjMoveStringLiteralDfa4_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_4(active0, 0x800000L);
      case 101:
         return jjMoveStringLiteralDfa5_4(active0, 0x400000L);
      case 104:
         return jjMoveStringLiteralDfa5_4(active0, 0x200000L);
      case 108:
         return jjMoveStringLiteralDfa5_4(active0, 0x40000L);
      case 111:
         return jjMoveStringLiteralDfa5_4(active0, 0x80000L);
      default :
         return 5;
   }
}
private final int jjMoveStringLiteralDfa5_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 5;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 5;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa6_4(active0, 0x200000L);
      case 101:
         return jjMoveStringLiteralDfa6_4(active0, 0x40000L);
      case 108:
         return jjMoveStringLiteralDfa6_4(active0, 0x800000L);
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(5, 19);
         break;
      case 114:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(5, 22);
         break;
      default :
         return 6;
   }
   return 6;
}
private final int jjMoveStringLiteralDfa6_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 6;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 6;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa7_4(active0, 0x40000L);
      case 97:
         return jjMoveStringLiteralDfa7_4(active0, 0x200000L);
      case 115:
         return jjMoveStringLiteralDfa7_4(active0, 0x800000L);
      default :
         return 7;
   }
}
private final int jjMoveStringLiteralDfa7_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 7;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 7;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa8_4(active0, 0x800000L);
      case 108:
         return jjMoveStringLiteralDfa8_4(active0, 0x40000L);
      case 116:
         return jjMoveStringLiteralDfa8_4(active0, 0x200000L);
      default :
         return 8;
   }
}
private final int jjMoveStringLiteralDfa8_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 8;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 8;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa9_4(active0, 0x800000L);
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(8, 21);
         break;
      case 105:
         return jjMoveStringLiteralDfa9_4(active0, 0x40000L);
      default :
         return 9;
   }
   return 9;
}
private final int jjMoveStringLiteralDfa9_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 9;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 9;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa10_4(active0, 0x40000L);
      case 117:
         return jjMoveStringLiteralDfa10_4(active0, 0x800000L);
      default :
         return 10;
   }
}
private final int jjMoveStringLiteralDfa10_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 10;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 10;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa11_4(active0, 0x800000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(10, 18);
         break;
      default :
         return 11;
   }
   return 11;
}
private final int jjMoveStringLiteralDfa11_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 11;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 11;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa12_4(active0, 0x800000L);
      default :
         return 12;
   }
}
private final int jjMoveStringLiteralDfa12_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 12;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 12;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa13_4(active0, 0x800000L);
      default :
         return 13;
   }
}
private final int jjMoveStringLiteralDfa13_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 13;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 13;
   }
   switch(curChar)
   {
      case 121:
         return jjMoveStringLiteralDfa14_4(active0, 0x800000L);
      default :
         return 14;
   }
}
private final int jjMoveStringLiteralDfa14_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 14;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 14;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa15_4(active0, 0x800000L);
      default :
         return 15;
   }
}
private final int jjMoveStringLiteralDfa15_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 15;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 15;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa16_4(active0, 0x800000L);
      default :
         return 16;
   }
}
private final int jjMoveStringLiteralDfa16_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 16;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 16;
   }
   switch(curChar)
   {
      case 109:
         return jjMoveStringLiteralDfa17_4(active0, 0x800000L);
      default :
         return 17;
   }
}
private final int jjMoveStringLiteralDfa17_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 17;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 17;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa18_4(active0, 0x800000L);
      default :
         return 18;
   }
}
private final int jjMoveStringLiteralDfa18_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 18;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 18;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa19_4(active0, 0x800000L);
      default :
         return 19;
   }
}
private final int jjMoveStringLiteralDfa19_4(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 19;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 19;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(19, 23);
         break;
      default :
         return 20;
   }
   return 20;
}
private final int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa1_2(0x100000000L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa2_2(active0, 0x100000000L);
      default :
         return 2;
   }
}
private final int jjMoveStringLiteralDfa2_2(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(2, 32);
         break;
      default :
         return 3;
   }
   return 3;
}
static final int[] jjnextStates = {
   4, 5, 7, 8, 
};
public static final String[] jjstrLiteralImages = {
null, null, null, null, null, null, null, null, null, null, null, 
"\74\77\170\155\154", "\74", "\74\57", "\74\77", "\74\41\55\55", 
"\74\41\133\103\104\101\124\101\133", null, "\160\145\157\160\154\145\137\154\151\163\164", 
"\160\145\162\163\157\156", "\156\141\155\145", "\142\151\162\164\150\144\141\164\145", 
"\147\145\156\144\145\162", 
"\163\157\143\151\141\154\163\145\143\165\162\151\164\171\156\165\155\142\145\162", null, null, "\76", "\77\76", "\57\76", "\75", null, null, null, null, null, 
null, null, };
public static final String[] lexStateNames = {
   "LexCDATA", 
   "LexPI", 
   "LexComment", 
   "LexElement_Inside", 
   "LexElement_Start", 
   "DEFAULT", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 3, 4, 4, 1, 2, 0, -1, 3, 3, 3, 3, 3, 3, -1, 
   -1, 5, 5, -1, -1, -1, -1, 5, -1, 5, -1, 5, 
};
static final long[] jjtoToken = {
   0x157efff801L, 
};
static final long[] jjtoSkip = {
   0x1000000L, 
};
static final long[] jjtoSpecial = {
   0x1000000L, 
};
static final long[] jjtoMore = {
   0xa80000000L, 
};
protected CharStream input_stream;
private final int[] jjrounds = new int[9];
private final int[] jjstateSet = new int[18];
protected char curChar;
public PeopleParserTokenManager(CharStream stream){
   input_stream = stream;
}
public PeopleParserTokenManager(CharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(CharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 9; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(CharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 6 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   t.offset = input_stream.getOffset();
   t.length = input_stream.getLength();
   return t;
}

int curLexState = 5;
int defaultLexState = 5;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         if (jjmatchedPos == 0 && jjmatchedKind > 35)
         {
            jjmatchedKind = 35;
         }
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 33)
         {
            jjmatchedKind = 33;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 31)
         {
            jjmatchedKind = 31;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         break;
       case 4:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_4();
         break;
       case 5:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_5();
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
           }
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

}
