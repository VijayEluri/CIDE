/* Generated By:JavaCC: Do not edit this line. DTDParser.java */
package tmp.generated_dtd;

import java.io.*;
import java.util.*;
import cide.gast.*;
import cide.gparser.*;

  public class DTDParser implements DTDParserConstants {

  final public DTD DTD() throws ParseException {
        DTDEntry dTDEntry;
        ArrayList<DTDEntry> dTDEntryList = new ArrayList<DTDEntry>();
        Token t;
        ASTStringNode eof;
        Token firstToken=token;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 31:
      case 34:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      dTDEntry = DTDEntry();
                             dTDEntryList.add(dTDEntry);
    }
    t = jj_consume_token(0);
                                                                    eof=new ASTStringNode(t.toString(),new WToken(token));
         {if (true) return new DTD(dTDEntryList, eof, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public DTDEntry DTDEntry() throws ParseException {
        ElementDecl elementDecl;
        AttListDecl attListDecl;
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 31:
      elementDecl = ElementDecl();
         {if (true) return new DTDEntry1(elementDecl, firstToken.next,token);}
      break;
    case 34:
      attListDecl = AttListDecl();
         {if (true) return new DTDEntry2(attListDecl, firstToken.next,token);}
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public ElementDecl ElementDecl() throws ParseException {
        Token t;
        ASTStringNode name;
        ContentSpec contentSpec;
        Token firstToken=token;
    jj_consume_token(31);
    t = jj_consume_token(NAME);
                             name=new ASTStringNode(t.toString(),new WToken(token));
    contentSpec = ContentSpec();
    jj_consume_token(PCB);
         {if (true) return new ElementDecl(name, contentSpec, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public ContentSpec ContentSpec() throws ParseException {
        Children children;
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EMPTY:
      jj_consume_token(EMPTY);
         {if (true) return new ContentSpec1(firstToken.next,token);}
      break;
    case ANY:
      jj_consume_token(ANY);
         {if (true) return new ContentSpec2(firstToken.next,token);}
      break;
    case OB:
      children = Children();
         {if (true) return new ContentSpec3(children, firstToken.next,token);}
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Children Children() throws ParseException {
        SeqOrChoice seqOrChoice;
        Modifier modifier = null;
        Token firstToken=token;
    seqOrChoice = SeqOrChoice();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STAR:
    case PLUS:
    case Q:
      modifier = Modifier();
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
         {if (true) return new Children(seqOrChoice, modifier, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public SeqOrChoice SeqOrChoice() throws ParseException {
        Choice choice;
        Seq seq;
        Token firstToken=token;
    if (jj_2_1(2147483647)) {
      choice = Choice();
         {if (true) return new SeqOrChoice1(choice, firstToken.next,token);}
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OB:
        seq = Seq();
         {if (true) return new SeqOrChoice2(seq, firstToken.next,token);}
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  final public Choice Choice() throws ParseException {
        Cp cp;
        ArrayList<Cp> list0=new ArrayList<Cp>();
        Cp cp1;
        ArrayList<Cp> cp1List = new ArrayList<Cp>();
        Token firstToken=token;
    jj_consume_token(OB);
    cp = Cp();
                    list0.add(cp);
    label_2:
    while (true) {
      jj_consume_token(32);
      cp1 = Cp();
                                                  list0.add(cp1);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 32:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_2;
      }
    }
    jj_consume_token(CB);
         {if (true) return new Choice(list0, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Seq Seq() throws ParseException {
        Cp cp;
        ArrayList<Cp> list0=new ArrayList<Cp>();
        Cp cp1;
        ArrayList<Cp> cp1List = new ArrayList<Cp>();
        Token firstToken=token;
    jj_consume_token(OB);
    cp = Cp();
                    list0.add(cp);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 33:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_3;
      }
      jj_consume_token(33);
      cp1 = Cp();
                                                  list0.add(cp1);
    }
    jj_consume_token(CB);
         {if (true) return new Seq(list0, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Cp Cp() throws ParseException {
        Token t;
        ASTStringNode name;
        Modifier modifier = null;
        SeqOrChoice seqOrChoice;
        Modifier modifier1 = null;
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PCDATA:
      jj_consume_token(PCDATA);
         {if (true) return new Cp1(firstToken.next,token);}
      break;
    case NAME:
      t = jj_consume_token(NAME);
                 name=new ASTStringNode(t.toString(),new WToken(token));
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STAR:
      case PLUS:
      case Q:
        modifier = Modifier();
        break;
      default:
        jj_la1[7] = jj_gen;
        ;
      }
         {if (true) return new Cp2(name, modifier, firstToken.next,token);}
      break;
    case OB:
      seqOrChoice = SeqOrChoice();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STAR:
      case PLUS:
      case Q:
        modifier1 = Modifier();
        break;
      default:
        jj_la1[8] = jj_gen;
        ;
      }
         {if (true) return new Cp3(seqOrChoice, modifier1, firstToken.next,token);}
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Modifier Modifier() throws ParseException {
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STAR:
      jj_consume_token(STAR);
         {if (true) return new Modifier1(firstToken.next,token);}
      break;
    case PLUS:
      jj_consume_token(PLUS);
         {if (true) return new Modifier2(firstToken.next,token);}
      break;
    case Q:
      jj_consume_token(Q);
         {if (true) return new Modifier3(firstToken.next,token);}
      break;
    default:
      jj_la1[10] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public AttListDecl AttListDecl() throws ParseException {
        Token t;
        ASTStringNode name;
        AttribDef attribDef;
        ArrayList<AttribDef> attribDefList = new ArrayList<AttribDef>();
        Token firstToken=token;
    jj_consume_token(34);
    t = jj_consume_token(NAME);
                             name=new ASTStringNode(t.toString(),new WToken(token));
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NAME:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_4;
      }
      attribDef = AttribDef();
                                                                                                             attribDefList.add(attribDef);
    }
    jj_consume_token(PCB);
         {if (true) return new AttListDecl(name, attribDefList, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public AttribDef AttribDef() throws ParseException {
        Token t;
        ASTStringNode name;
        AttribType attribType;
        DefaultDecl defaultDecl;
        Token firstToken=token;
    t = jj_consume_token(NAME);
                 name=new ASTStringNode(t.toString(),new WToken(token));
    attribType = AttribType();
    defaultDecl = DefaultDecl();
         {if (true) return new AttribDef(name, attribType, defaultDecl, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public AttribType AttribType() throws ParseException {
        StringType stringType;
        TokenizedType tokenizedType;
        EnumeratedType enumeratedType;
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CDATA:
      stringType = StringType();
         {if (true) return new AttribType1(stringType, firstToken.next,token);}
      break;
    case ID:
    case IDREF:
    case IDREFS:
    case ENTITY:
    case ENTITIES:
    case NMTOKEN:
    case NMTOKENS:
      tokenizedType = TokenizedType();
         {if (true) return new AttribType2(tokenizedType, firstToken.next,token);}
      break;
    case NOTATION:
    case OB:
      enumeratedType = EnumeratedType();
         {if (true) return new AttribType3(enumeratedType, firstToken.next,token);}
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public StringType StringType() throws ParseException {
        Token firstToken=token;
    jj_consume_token(CDATA);
         {if (true) return new StringType(firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public TokenizedType TokenizedType() throws ParseException {
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      jj_consume_token(ID);
         {if (true) return new TokenizedType1(firstToken.next,token);}
      break;
    case IDREF:
      jj_consume_token(IDREF);
         {if (true) return new TokenizedType2(firstToken.next,token);}
      break;
    case IDREFS:
      jj_consume_token(IDREFS);
         {if (true) return new TokenizedType3(firstToken.next,token);}
      break;
    case ENTITY:
      jj_consume_token(ENTITY);
         {if (true) return new TokenizedType4(firstToken.next,token);}
      break;
    case ENTITIES:
      jj_consume_token(ENTITIES);
         {if (true) return new TokenizedType5(firstToken.next,token);}
      break;
    case NMTOKEN:
      jj_consume_token(NMTOKEN);
         {if (true) return new TokenizedType6(firstToken.next,token);}
      break;
    case NMTOKENS:
      jj_consume_token(NMTOKENS);
         {if (true) return new TokenizedType7(firstToken.next,token);}
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public EnumeratedType EnumeratedType() throws ParseException {
        NotationType notationType;
        Enumeration enumeration;
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOTATION:
      notationType = NotationType();
         {if (true) return new EnumeratedType1(notationType, firstToken.next,token);}
      break;
    case OB:
      enumeration = Enumeration();
         {if (true) return new EnumeratedType2(enumeration, firstToken.next,token);}
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public NotationType NotationType() throws ParseException {
        Token t;
        ASTStringNode name;
        ASTStringNode name1;
        ArrayList<ASTStringNode> name1List = new ArrayList<ASTStringNode>();
        Token firstToken=token;
    jj_consume_token(NOTATION);
    jj_consume_token(OB);
    t = jj_consume_token(NAME);
                                name=new ASTStringNode(t.toString(),new WToken(token));
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 32:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_5;
      }
      jj_consume_token(32);
      t = jj_consume_token(NAME);
                                                                                                       name1=new ASTStringNode(t.toString(),new WToken(token));
                                                                                                                                                                 name1List.add(name1);
    }
    jj_consume_token(CB);
         {if (true) return new NotationType(name, name1List, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Enumeration Enumeration() throws ParseException {
        Token t;
        ASTStringNode name;
        ASTStringNode name1;
        ArrayList<ASTStringNode> name1List = new ArrayList<ASTStringNode>();
        Token firstToken=token;
    jj_consume_token(OB);
    t = jj_consume_token(NAME);
                     name=new ASTStringNode(t.toString(),new WToken(token));
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 32:
        ;
        break;
      default:
        jj_la1[16] = jj_gen;
        break label_6;
      }
      jj_consume_token(32);
      t = jj_consume_token(NAME);
                                                                                            name1=new ASTStringNode(t.toString(),new WToken(token));
                                                                                                                                                      name1List.add(name1);
    }
    jj_consume_token(CB);
         {if (true) return new Enumeration(name, name1List, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public DefaultDecl DefaultDecl() throws ParseException {
        ASTTextNode text17 = null;
        AttribValue attribValue;
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case REQUIRED:
      jj_consume_token(REQUIRED);
         {if (true) return new DefaultDecl1(firstToken.next,token);}
      break;
    case IMPLIED:
      jj_consume_token(IMPLIED);
         {if (true) return new DefaultDecl2(firstToken.next,token);}
      break;
    case FIXED:
    case QUOTEDSTR:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FIXED:
        jj_consume_token(FIXED);
                   text17=new ASTTextNode("#FIXED",new WToken(token));
        break;
      default:
        jj_la1[17] = jj_gen;
        ;
      }
      attribValue = AttribValue();
         {if (true) return new DefaultDecl3(text17, attribValue, firstToken.next,token);}
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public AttribValue AttribValue() throws ParseException {
        Token t;
        ASTStringNode quotedstr;
        Token firstToken=token;
    t = jj_consume_token(QUOTEDSTR);
                      quotedstr=new ASTStringNode(t.toString(),new WToken(token));
         {if (true) return new AttribValue(quotedstr, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  final private boolean jj_3R_7() {
    if (jj_scan_token(OB)) return true;
    if (jj_3R_8()) return true;
    Token xsp;
    if (jj_3R_9()) return true;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_9()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(CB)) return true;
    return false;
  }

  final private boolean jj_3R_23() {
    if (jj_scan_token(33)) return true;
    if (jj_3R_8()) return true;
    return false;
  }

  final private boolean jj_3R_21() {
    if (jj_scan_token(Q)) return true;
    return false;
  }

  final private boolean jj_3R_18() {
    if (jj_3R_22()) return true;
    return false;
  }

  final private boolean jj_3R_20() {
    if (jj_scan_token(PLUS)) return true;
    return false;
  }

  final private boolean jj_3R_17() {
    if (jj_3R_7()) return true;
    return false;
  }

  final private boolean jj_3R_19() {
    if (jj_scan_token(STAR)) return true;
    return false;
  }

  final private boolean jj_3R_14() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) return true;
    }
    return false;
  }

  final private boolean jj_3R_9() {
    if (jj_scan_token(32)) return true;
    if (jj_3R_8()) return true;
    return false;
  }

  final private boolean jj_3R_16() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_19()) {
    jj_scanpos = xsp;
    if (jj_3R_20()) {
    jj_scanpos = xsp;
    if (jj_3R_21()) return true;
    }
    }
    return false;
  }

  final private boolean jj_3R_12() {
    if (jj_3R_14()) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_15()) jj_scanpos = xsp;
    return false;
  }

  final private boolean jj_3R_11() {
    if (jj_scan_token(NAME)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_13()) jj_scanpos = xsp;
    return false;
  }

  final private boolean jj_3R_10() {
    if (jj_scan_token(PCDATA)) return true;
    return false;
  }

  final private boolean jj_3R_8() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_10()) {
    jj_scanpos = xsp;
    if (jj_3R_11()) {
    jj_scanpos = xsp;
    if (jj_3R_12()) return true;
    }
    }
    return false;
  }

  final private boolean jj_3R_15() {
    if (jj_3R_16()) return true;
    return false;
  }

  final private boolean jj_3R_22() {
    if (jj_scan_token(OB)) return true;
    if (jj_3R_8()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_23()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(CB)) return true;
    return false;
  }

  final private boolean jj_3R_13() {
    if (jj_3R_16()) return true;
    return false;
  }

  final private boolean jj_3_1() {
    if (jj_3R_7()) return true;
    return false;
  }

  public DTDParserTokenManager token_source;
  public Token token, jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  public boolean lookingAhead = false;
  private boolean jj_semLA;
  private int jj_gen;
  final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_0();
      jj_la1_1();
   }
   private static void jj_la1_0() {
      jj_la1_0 = new int[] {0x80000000,0x80000000,0x80600,0x3800000,0x80000,0x0,0x0,0x3800000,0x3800000,0x4080040,0x3800000,0x4000000,0xff900,0x3f800,0xc0000,0x0,0x0,0x10,0x80000b0,};
   }
   private static void jj_la1_1() {
      jj_la1_1 = new int[] {0x4,0x4,0x0,0x0,0x0,0x1,0x2,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x1,0x0,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[1];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  public DTDParser(CharStream stream) {
    token_source = new DTDParserTokenManager(stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public void ReInit(CharStream stream) {
    token_source.ReInit(stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public DTDParser(DTDParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public void ReInit(DTDParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  final private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = lookingAhead ? jj_scanpos : token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Enumeration e = jj_expentries.elements(); e.hasMoreElements();) {
        int[] oldentry = (int[])(e.nextElement());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.addElement(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[35];
    for (int i = 0; i < 35; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 35; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

  final private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 1; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  final private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

  }
