package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class ShiftOp2 extends ShiftOp {
  public ShiftOp2(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public ShiftOp2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new ShiftOp2(cloneProperties(),firstToken,lastToken);
  }
}
