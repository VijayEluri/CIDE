package tmp.generated_javacc;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class FormalParametersInternal extends GenASTNode {
  public FormalParametersInternal(ArrayList<FormalParameter> formalParameter, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyList<FormalParameter>("formalParameter", formalParameter)
    }, firstToken, lastToken);
  }
  public FormalParametersInternal(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new FormalParametersInternal(cloneProperties(),firstToken,lastToken);
  }
  public ArrayList<FormalParameter> getFormalParameter() {
    return ((PropertyList<FormalParameter>)getProperty("formalParameter")).getValue();
  }
}
