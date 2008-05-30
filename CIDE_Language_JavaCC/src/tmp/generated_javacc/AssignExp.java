package tmp.generated_javacc;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class AssignExp extends GenASTNode {
  public AssignExp(AssignmentOperator assignmentOperator, Expression expression, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<AssignmentOperator>("assignmentOperator", assignmentOperator),
      new PropertyOne<Expression>("expression", expression)
    }, firstToken, lastToken);
  }
  public AssignExp(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new AssignExp(cloneProperties(),firstToken,lastToken);
  }
  public AssignmentOperator getAssignmentOperator() {
    return ((PropertyOne<AssignmentOperator>)getProperty("assignmentOperator")).getValue();
  }
  public Expression getExpression() {
    return ((PropertyOne<Expression>)getProperty("expression")).getValue();
  }
}
