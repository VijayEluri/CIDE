package tmp.generated_people;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_map_Choice29 extends Content_map_Choice2 {
  public Content_map_Choice29(Element_ul element_ul, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_ul>("element_ul", element_ul)
    }, firstToken, lastToken);
  }
  public Content_map_Choice29(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_map_Choice29(cloneProperties(),firstToken,lastToken);
  }
  public Element_ul getElement_ul() {
    return ((PropertyOne<Element_ul>)getProperty("element_ul")).getValue();
  }
}
