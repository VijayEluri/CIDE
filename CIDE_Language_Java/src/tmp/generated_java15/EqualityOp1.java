package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class EqualityOp1 extends EqualityOp {
  public EqualityOp1(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public EqualityOp1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new EqualityOp1(cloneProperties(),firstToken,lastToken);
  }
}
