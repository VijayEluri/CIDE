package tmp.generated_people;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_map_Choice218 extends Content_map_Choice2 {
  public Content_map_Choice218(Element_form element_form, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_form>("element_form", element_form)
    }, firstToken, lastToken);
  }
  public Content_map_Choice218(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_map_Choice218(cloneProperties(),firstToken,lastToken);
  }
  public Element_form getElement_form() {
    return ((PropertyOne<Element_form>)getProperty("element_form")).getValue();
  }
}
