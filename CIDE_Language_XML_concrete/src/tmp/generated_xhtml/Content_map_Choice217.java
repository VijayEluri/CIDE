package tmp.generated_xhtml;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_map_Choice217 extends Content_map_Choice2 {
  public Content_map_Choice217(Element_table element_table, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_table>("element_table", element_table)
    }, firstToken, lastToken);
  }
  public Content_map_Choice217(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_map_Choice217(cloneProperties(),firstToken,lastToken);
  }
  public Element_table getElement_table() {
    return ((PropertyOne<Element_table>)getProperty("element_table")).getValue();
  }
}
