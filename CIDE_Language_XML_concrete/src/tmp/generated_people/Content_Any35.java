package tmp.generated_people;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_Any35 extends Content_Any {
  public Content_Any35(Element_ol element_ol, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_ol>("element_ol", element_ol)
    }, firstToken, lastToken);
  }
  public Content_Any35(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_Any35(cloneProperties(),firstToken,lastToken);
  }
  public Element_ol getElement_ol() {
    return ((PropertyOne<Element_ol>)getProperty("element_ol")).getValue();
  }
}
