package tmp.generated_people;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_Any12 extends Content_Any {
  public Content_Any12(Element_span element_span, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_span>("element_span", element_span)
    }, firstToken, lastToken);
  }
  public Content_Any12(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_Any12(cloneProperties(),firstToken,lastToken);
  }
  public Element_span getElement_span() {
    return ((PropertyOne<Element_span>)getProperty("element_span")).getValue();
  }
}
