package tmp.generated_people;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_noscript_Choice12 extends Content_noscript_Choice1 {
  public Content_noscript_Choice12(Element_h1 element_h1, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_h1>("element_h1", element_h1)
    }, firstToken, lastToken);
  }
  public Content_noscript_Choice12(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_noscript_Choice12(cloneProperties(),firstToken,lastToken);
  }
  public Element_h1 getElement_h1() {
    return ((PropertyOne<Element_h1>)getProperty("element_h1")).getValue();
  }
}
