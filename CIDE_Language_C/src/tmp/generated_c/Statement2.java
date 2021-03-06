package tmp.generated_c;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Statement2 extends Statement {
  public Statement2(ExpressionStatement expressionStatement, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<ExpressionStatement>("expressionStatement", expressionStatement)
    }, firstToken, lastToken);
  }
  public Statement2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new Statement2(cloneProperties(),firstToken,lastToken);
  }
  public ExpressionStatement getExpressionStatement() {
    return ((PropertyOne<ExpressionStatement>)getProperty("expressionStatement")).getValue();
  }
}
