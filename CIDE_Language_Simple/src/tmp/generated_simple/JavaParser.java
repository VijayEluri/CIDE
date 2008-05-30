/* Generated By:JavaCC: Do not edit this line. JavaParser.java */
package tmp.generated_simple;

import java.io.*;
import java.util.*;
import cide.gast.*;
import cide.gparser.*;

/**
 * Grammar to parse Java version 1.5
 * @author Sreenivasa Viswanadha - Simplified and enhanced for 1.5
 */
public class JavaParser implements JavaParserConstants {
            public ISourceFile getRoot() throws ParseException {
                return CompilationUnit();
        }

  final public CompilationUnit CompilationUnit() throws ParseException {
        TypeDeclaration typeDeclaration;
        ArrayList<TypeDeclaration> typeDeclarationList = new ArrayList<TypeDeclaration>();
        Token t;
        ASTStringNode eof;
        Token firstToken=token;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        ;
        break;
      default:
        break label_1;
      }
      typeDeclaration = TypeDeclaration();
                                           typeDeclarationList.add(typeDeclaration);
    }
    t = jj_consume_token(0);
                                                                                                eof=new ASTStringNode(t.toString(),new WToken(t));
         {if (true) return new CompilationUnit(typeDeclarationList, eof, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public TypeDeclaration TypeDeclaration() throws ParseException {
        Name name;
        Name name1 = null;
        ClassBody classBody;
        Token firstToken=token;
    jj_consume_token(CLASS);
    name = Name();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EXTENDS:
      jj_consume_token(EXTENDS);
      name1 = Name();
      break;
    default:
      ;
    }
    classBody = ClassBody();
         {if (true) return new TypeDeclaration(name, name1, classBody, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Name Name() throws ParseException {
        Token t;
        ASTStringNode identifier;
        Token firstToken=token;
    t = jj_consume_token(IDENTIFIER);
                       identifier=new ASTStringNode(t.toString(),new WToken(t));
         {if (true) return new Name(identifier, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public ClassBody ClassBody() throws ParseException {
        Member member;
        ArrayList<Member> memberList = new ArrayList<Member>();
        Token firstToken=token;
    jj_consume_token(LBRACE);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VOID:
      case IDENTIFIER:
        ;
        break;
      default:
        break label_2;
      }
      member = Member();
                             memberList.add(member);
    }
    jj_consume_token(RBRACE);
         {if (true) return new ClassBody(memberList, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Member Member() throws ParseException {
        Method method;
        Field field;
        Token firstToken=token;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VOID:
      method = Method();
         {if (true) return new Member1(method, firstToken.next,token);}
      break;
    case IDENTIFIER:
      field = Field();
         {if (true) return new Member2(field, firstToken.next,token);}
      break;
    default:
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  final public Method Method() throws ParseException {
        Name name;
        Block block;
        Token firstToken=token;
    jj_consume_token(VOID);
    name = Name();
    jj_consume_token(LPAREN);
    jj_consume_token(RPAREN);
    block = Block();
         {if (true) return new Method(name, block, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Field Field() throws ParseException {
        Name name;
        Token firstToken=token;
    name = Name();
    jj_consume_token(SEMICOLON);
         {if (true) return new Field(name, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Block Block() throws ParseException {
        Statement statement;
        ArrayList<Statement> statementList = new ArrayList<Statement>();
        Token firstToken=token;
    jj_consume_token(LBRACE);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case IDENTIFIER:
      case LBRACE:
        ;
        break;
      default:
        break label_3;
      }
      statement = Statement();
                                   statementList.add(statement);
    }
    jj_consume_token(RBRACE);
         {if (true) return new Block(statementList, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Statement Statement() throws ParseException {
        MethodInvocation methodInvocation;
        ASTNode ifStatement;
        Assignment assignment;
        Block block;
        Token firstToken=token;
    if (jj_2_1(2)) {
      methodInvocation = MethodInvocation();
      jj_consume_token(SEMICOLON);
         {if (true) return new Statement1(methodInvocation, firstToken.next,token);}
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
        ifStatement = IfStatement();
         {if (true) return new Statement2(ifStatement, firstToken.next,token);}
        break;
      case IDENTIFIER:
        assignment = Assignment();
        jj_consume_token(SEMICOLON);
         {if (true) return new Statement3(assignment, firstToken.next,token);}
        break;
      case LBRACE:
        block = Block();
         {if (true) return new Statement4(block, firstToken.next,token);}
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  final public MethodInvocation MethodInvocation() throws ParseException {
        Name name;
        Token firstToken=token;
    name = Name();
    jj_consume_token(LPAREN);
    jj_consume_token(RPAREN);
         {if (true) return new MethodInvocation(name, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Assignment Assignment() throws ParseException {
        Name name;
        Expression expression;
        Token firstToken=token;
    name = Name();
    jj_consume_token(ASSIGN);
    expression = Expression();
         {if (true) return new Assignment(name, expression, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public IfStatement IfStatement() throws ParseException {
        Expression expression;
        Block block;
        Block block1 = null;
        Token firstToken=token;
    jj_consume_token(IF);
    jj_consume_token(LPAREN);
    expression = Expression();
    jj_consume_token(RPAREN);
    block = Block();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
      jj_consume_token(ELSE);
      block1 = Block();
      break;
    default:
      ;
    }
         {if (true) return new IfStatement(expression, block, block1, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public Expression Expression() throws ParseException {
        BinaryExpression binaryExpression;
        UnaryExpression unaryExpression;
        Token firstToken=token;
    if (jj_2_2(2)) {
      binaryExpression = BinaryExpression();
         {if (true) return new Expression1(binaryExpression, firstToken.next,token);}
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEGER_LITERAL:
        unaryExpression = UnaryExpression();
         {if (true) return new Expression2(unaryExpression, firstToken.next,token);}
        break;
      default:
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  final public UnaryExpression UnaryExpression() throws ParseException {
        Token t;
        ASTStringNode integer_literal;
        Token firstToken=token;
    t = jj_consume_token(INTEGER_LITERAL);
                            integer_literal=new ASTStringNode(t.toString(),new WToken(t));
         {if (true) return new UnaryExpression(integer_literal, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final public BinaryExpression BinaryExpression() throws ParseException {
        UnaryExpression unaryExpression;
        Expression expression;
        Token firstToken=token;
    unaryExpression = UnaryExpression();
    jj_consume_token(PLUS);
    expression = Expression();
         {if (true) return new BinaryExpression(unaryExpression, expression, firstToken.next,token);}
    throw new Error("Missing return statement in function");
  }

  final private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  final private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
  }

  final private boolean jj_3R_5() {
    if (jj_3R_7()) return true;
    if (jj_scan_token(PLUS)) return true;
    return false;
  }

  final private boolean jj_3_1() {
    if (jj_3R_4()) return true;
    return false;
  }

  final private boolean jj_3R_4() {
    if (jj_3R_6()) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  final private boolean jj_3_2() {
    if (jj_3R_5()) return true;
    return false;
  }

  final private boolean jj_3R_7() {
    if (jj_scan_token(INTEGER_LITERAL)) return true;
    return false;
  }

  final private boolean jj_3R_6() {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  public JavaParserTokenManager token_source;
  public Token token, jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  public boolean lookingAhead = false;
  private boolean jj_semLA;

  public JavaParser(CharStream stream) {
    token_source = new JavaParserTokenManager(stream);
    token = new Token();
    jj_ntk = -1;
  }

  public void ReInit(CharStream stream) {
    token_source.ReInit(stream);
    token = new Token();
    jj_ntk = -1;
  }

  public JavaParser(JavaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
  }

  public void ReInit(JavaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      return token;
    }
    token = oldToken;
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
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
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

  public ParseException generateParseException() {
    Token errortok = token.next;
    int line = errortok.beginLine, column = errortok.beginColumn;
    String mess = (errortok.kind == 0) ? tokenImage[0] : errortok.image;
    return new ParseException("Parse error at line " + line + ", column " + column + ".  Encountered: " + mess);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}
