/* Generated By:JavaCC: Do not edit this line. HaskellParserTokenManager.java */
package tmp.generated_phaskell;
import java.io.*;
import java.util.*;
import cide.gast.*;
import cide.gparser.*;
import cide.gparser.*;
public class HaskellParserTokenManager implements HaskellParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000000000000L) != 0L)
            return 6;
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 58;
            return 38;
         }
         if ((active0 & 0xffffeL) != 0L)
         {
            jjmatchedKind = 31;
            return 16;
         }
         if ((active0 & 0x700000L) != 0L)
            return 50;
         return -1;
      case 1:
         if ((active0 & 0x800000L) != 0L)
            return 38;
         if ((active0 & 0x18040L) != 0L)
            return 16;
         if ((active0 & 0x100000L) != 0L)
            return 50;
         if ((active0 & 0xe7fbeL) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
            return 16;
         }
         return -1;
      case 2:
         if ((active0 & 0x4000L) != 0L)
            return 16;
         if ((active0 & 0xe3fbeL) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
            return 16;
         }
         return -1;
      case 3:
         if ((active0 & 0x300L) != 0L)
            return 16;
         if ((active0 & 0xe3cbeL) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 3;
            return 16;
         }
         return -1;
      case 4:
         if ((active0 & 0xe0804L) != 0L)
            return 16;
         if ((active0 & 0x34baL) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 31;
               jjmatchedPos = 4;
            }
            return 16;
         }
         return -1;
      case 5:
         if ((active0 & 0x3430L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 5;
            return 16;
         }
         if ((active0 & 0x6008aL) != 0L)
            return 16;
         return -1;
      case 6:
         if ((active0 & 0x2400L) != 0L)
            return 16;
         if ((active0 & 0x1030L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 6;
            return 16;
         }
         return -1;
      case 7:
         if ((active0 & 0x1020L) != 0L)
            return 16;
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 7;
            return 16;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         return jjStopAtPos(0, 25);
      case 10:
         return jjStopAtPos(0, 26);
      case 13:
         return jjStopAtPos(0, 27);
      case 32:
         return jjStopAtPos(0, 24);
      case 40:
         return jjStopAtPos(0, 51);
      case 41:
         return jjStopAtPos(0, 52);
      case 44:
         return jjStopAtPos(0, 55);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 59:
         return jjStopAtPos(0, 50);
      case 61:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 91:
         return jjStopAtPos(0, 53);
      case 93:
         return jjStopAtPos(0, 54);
      case 96:
         return jjStopAtPos(0, 56);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0xa220L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xe1008L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 113:
         return jjMoveStringLiteralDfa1_0(0x10L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 123:
         return jjStartNfaWithStates_0(0, 48, 6);
      case 124:
         return jjStartNfaWithStates_0(0, 22, 50);
      case 125:
         return jjStopAtPos(0, 49);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 58:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 38);
         break;
      case 62:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(1, 20, 50);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x6420L);
      case 102:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 16);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x8L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0xe1000L);
      case 111:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 16);
         return jjMoveStringLiteralDfa2_0(active0, 0x2L);
      case 115:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(1, 6, 16);
         break;
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x10L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x810L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x82L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0xe2000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x108L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 116:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 16);
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 16);
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 16);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0xe00a0L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x10L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x8L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x4L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x1400L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 101:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(4, 2, 16);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x10L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x2L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x8L);
      case 115:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 16);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000L);
      case 118:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 120:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x60000L);
      case 121:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(5, 1, 16);
         break;
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x10L);
      case 103:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 16);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x20L);
      case 108:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(5, 17, 16);
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 114:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(5, 18, 16);
         break;
      case 116:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(5, 3, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 16);
         break;
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x10L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(7, 12, 16);
         return jjMoveStringLiteralDfa8_0(active0, 0x10L);
      case 103:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(7, 5, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(8, 4, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
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
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 51;
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
               case 5:
                  if ((0xfc00ffffffffffffL & l) != 0L)
                  {
                     if (kind > 60)
                        kind = 60;
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(17);
                  }
                  if ((0xf000ec7a00000000L & l) != 0L)
                  {
                     if (kind > 57)
                        kind = 57;
                     jjCheckNAdd(50);
                  }
                  else if ((0x8400000000L & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                  }
                  else if (curChar == 48)
                     jjAddStates(0, 3);
                  else if (curChar == 58)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAdd(38);
                  }
                  if (curChar == 34)
                     jjCheckNAddStates(4, 6);
                  else if (curChar == 39)
                     jjAddStates(7, 8);
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 0:
                  if (curChar == 45)
                     jjCheckNAddStates(9, 11);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 28)
                     kind = 28;
                  break;
               case 3:
                  if (curChar == 10 && kind > 28)
                     kind = 28;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 7:
                  if ((0xffffdfffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 8:
                  if (curChar == 45)
                     jjCheckNAddStates(12, 14);
                  break;
               case 9:
               case 10:
                  if ((0xffffdfffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 14:
                  if ((0x3ff008000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if ((0x3ff008000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(17);
                  break;
               case 18:
                  if (curChar == 39)
                     jjAddStates(7, 8);
                  break;
               case 19:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 20:
                  if (curChar == 39 && kind > 36)
                     kind = 36;
                  break;
               case 22:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 23:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(24, 20);
                  break;
               case 24:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 25:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(24);
                  break;
               case 27:
                  if (curChar == 34)
                     jjCheckNAddStates(4, 6);
                  break;
               case 28:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(4, 6);
                  break;
               case 30:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(4, 6);
                  break;
               case 31:
                  if (curChar == 34 && kind > 37)
                     kind = 37;
                  break;
               case 32:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(15, 18);
                  break;
               case 33:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(4, 6);
                  break;
               case 34:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 35:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(33);
                  break;
               case 36:
                  if ((0x8400000000L & l) != 0L && kind > 39)
                     kind = 39;
                  break;
               case 37:
                  if (curChar != 58)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAdd(38);
                  break;
               case 38:
                  if ((0xf400ec7a00000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAdd(38);
                  break;
               case 39:
                  if ((0xfc00ffffffffffffL & l) != 0L && kind > 60)
                     kind = 60;
                  break;
               case 40:
                  if (curChar == 48)
                     jjAddStates(0, 3);
                  break;
               case 42:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjstateSet[jjnewStateCnt++] = 48;
                  break;
               case 49:
                  if ((0xf000ec7a00000000L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(50);
                  break;
               case 50:
                  if ((0xf400ec7a00000000L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(50);
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
               case 5:
                  if ((0x7fffffe80000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(16);
                  }
                  else if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(14);
                  }
                  else if ((0x5000000050000001L & l) != 0L)
                  {
                     if (kind > 57)
                        kind = 57;
                     jjCheckNAdd(50);
                  }
                  else if (curChar == 123)
                     jjstateSet[jjnewStateCnt++] = 6;
                  if ((0xf8000001f8000001L & l) != 0L)
                  {
                     if (kind > 60)
                        kind = 60;
                  }
                  if ((0x54404610000000L & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                  }
                  break;
               case 1:
                  jjAddStates(9, 11);
                  break;
               case 7:
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
                  if ((0xdfffffffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 10:
                  jjCheckNAddTwoStates(10, 8);
                  break;
               case 11:
                  if (curChar == 125 && kind > 29)
                     kind = 29;
                  break;
               case 12:
                  if (curChar == 123)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 13:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(14);
                  break;
               case 14:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(14);
                  break;
               case 15:
                  if ((0x7fffffe80000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(16);
                  break;
               case 19:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 21:
                  if (curChar == 92)
                     jjAddStates(19, 21);
                  break;
               case 22:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 28:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(4, 6);
                  break;
               case 29:
                  if (curChar == 92)
                     jjAddStates(22, 24);
                  break;
               case 30:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(4, 6);
                  break;
               case 36:
                  if ((0x54404610000000L & l) != 0L && kind > 39)
                     kind = 39;
                  break;
               case 38:
                  if ((0x5000000050000001L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 39:
                  if ((0xf8000001f8000001L & l) != 0L && kind > 60)
                     kind = 60;
                  break;
               case 41:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 43:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 45:
                  if (curChar == 120)
                     jjCheckNAdd(46);
                  break;
               case 46:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(46);
                  break;
               case 47:
                  if (curChar == 88)
                     jjCheckNAdd(48);
                  break;
               case 48:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(48);
                  break;
               case 49:
               case 50:
                  if ((0x5000000050000001L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(50);
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
               case 5:
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 60)
                     kind = 60;
                  break;
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(9, 11);
                  break;
               case 7:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(10, 8);
                  break;
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 28:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(4, 6);
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
      if ((i = jjnewStateCnt) == (startsAt = 51 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private final int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
private final int jjMoveNfa_1(int startState, int curPos)
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
                  if ((0xfffffcffffffffffL & l) != 0L)
                     kind = 61;
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
                  kind = 61;
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
                  if ((jjbitVec0[i2] & l2) != 0L && kind > 61)
                     kind = 61;
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
static final int[] jjnextStates = {
   41, 43, 45, 47, 28, 29, 31, 19, 21, 1, 2, 4, 8, 9, 11, 28, 
   29, 33, 31, 22, 23, 25, 30, 32, 34, 
};
public static final String[] jjstrLiteralImages = {
"", "\155\157\144\165\154\145", "\167\150\145\162\145", 
"\151\155\160\157\162\164", "\161\165\141\154\151\146\151\145\144", "\144\145\162\151\166\151\156\147", 
"\141\163", "\150\151\144\151\156\147", "\164\171\160\145", "\144\141\164\141", 
"\156\145\167\164\171\160\145", "\143\154\141\163\163", "\151\156\163\164\141\156\143\145", 
"\144\145\146\141\165\154\164", "\154\145\164", "\144\157", "\157\146", "\151\156\146\151\170\154", 
"\151\156\146\151\170\162", "\151\156\146\151\170", "\75\76", "\75", "\174", "\72\72", null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, "\173", "\175", "\73", "\50", "\51", 
"\133", "\135", "\54", "\140", null, null, null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
   "PAREN", 
};
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x3fff00b1c0ffffffL, 
};
static final long[] jjtoSkip = {
   0x3f000000L, 
};
static final long[] jjtoSpecial = {
   0x3f000000L, 
};
protected CharStream input_stream;
private final int[] jjrounds = new int[51];
private final int[] jjstateSet = new int[102];
protected char curChar;
public HaskellParserTokenManager(CharStream stream){
   input_stream = stream;
}
public HaskellParserTokenManager(CharStream stream, int lexState){
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
   for (i = 51; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(CharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 2 || lexState < 0)
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

int curLexState = 0;
int defaultLexState = 0;
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

   switch(curLexState)
   {
     case 0:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
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
        else
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
