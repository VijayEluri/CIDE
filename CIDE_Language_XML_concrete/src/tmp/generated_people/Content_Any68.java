package tmp.generated_people;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_Any68 extends Content_Any {
  public Content_Any68(Element_acronym element_acronym, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_acronym>("element_acronym", element_acronym)
    }, firstToken, lastToken);
  }
  public Content_Any68(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_Any68(cloneProperties(),firstToken,lastToken);
  }
  public Element_acronym getElement_acronym() {
    return ((PropertyOne<Element_acronym>)getProperty("element_acronym")).getValue();
  }
}
