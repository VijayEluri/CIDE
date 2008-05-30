package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class PrimaryPrefix6 extends PrimaryPrefix {
  public PrimaryPrefix6(ResultType resultType, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<ResultType>("resultType", resultType)
    }, firstToken, lastToken);
  }
  public PrimaryPrefix6(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new PrimaryPrefix6(cloneProperties(),firstToken,lastToken);
  }
  public ResultType getResultType() {
    return ((PropertyOne<ResultType>)getProperty("resultType")).getValue();
  }
}
