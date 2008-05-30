package tmp.generated_cs;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class constructor_declaration extends GenASTNode {
  public constructor_declaration(formal_parameter_list formal_parameter_list, constructor_initializer constructor_initializer, body body, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyZeroOrOne<formal_parameter_list>("formal_parameter_list", formal_parameter_list),
      new PropertyZeroOrOne<constructor_initializer>("constructor_initializer", constructor_initializer),
      new PropertyOne<body>("body", body)
    }, firstToken, lastToken);
  }
  public constructor_declaration(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new constructor_declaration(cloneProperties(),firstToken,lastToken);
  }
  public formal_parameter_list getFormal_parameter_list() {
    return ((PropertyZeroOrOne<formal_parameter_list>)getProperty("formal_parameter_list")).getValue();
  }
  public constructor_initializer getConstructor_initializer() {
    return ((PropertyZeroOrOne<constructor_initializer>)getProperty("constructor_initializer")).getValue();
  }
  public body getBody() {
    return ((PropertyOne<body>)getProperty("body")).getValue();
  }
}
