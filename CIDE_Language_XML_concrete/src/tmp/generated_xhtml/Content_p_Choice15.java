package tmp.generated_xhtml;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_p_Choice15 extends Content_p_Choice1 {
  public Content_p_Choice15(Element_bdo element_bdo, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_bdo>("element_bdo", element_bdo)
    }, firstToken, lastToken);
  }
  public Content_p_Choice15(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_p_Choice15(cloneProperties(),firstToken,lastToken);
  }
  public Element_bdo getElement_bdo() {
    return ((PropertyOne<Element_bdo>)getProperty("element_bdo")).getValue();
  }
}
