/* Generated By:JavaCC: Do not edit this line. XhtmlParserConstants.java */
package tmp.generated_xhtml;

public interface XhtmlParserConstants {

  int EOF = 0;
  int ALPHA_CHAR = 1;
  int NUM_CHAR = 2;
  int ALPHANUM_CHAR = 3;
  int IDENTIFIER_CHAR = 4;
  int IDENTIFIER = 5;
  int QUOTED_STRING_NB = 6;
  int QUOTED_STRING = 7;
  int WHITESPACE = 8;
  int NEWLINE = 9;
  int QUOTE = 10;
  int XMLOPEN = 11;
  int SELEMENT_START = 12;
  int EELEMENT_START = 13;
  int PI_START = 14;
  int COMMENT_START = 15;
  int CDSTART = 16;
  int PCDATA = 17;
  int E_html = 18;
  int E_button = 19;
  int E_textarea = 20;
  int E_em = 21;
  int E_small = 22;
  int E_area = 23;
  int E_bdo = 24;
  int E_form = 25;
  int E_link = 26;
  int E_label = 27;
  int E_dt = 28;
  int E_span = 29;
  int E_title = 30;
  int E_strong = 31;
  int E_script = 32;
  int E_div = 33;
  int E_dl = 34;
  int E_blockquote = 35;
  int E_kbd = 36;
  int E_body = 37;
  int E_ins = 38;
  int E_map = 39;
  int E_dd = 40;
  int E_fieldset = 41;
  int E_head = 42;
  int E_col = 43;
  int E_base = 44;
  int E_big = 45;
  int E_meta = 46;
  int E_code = 47;
  int E_tbody = 48;
  int E_option = 49;
  int E_q = 50;
  int E_p = 51;
  int E_ol = 52;
  int E_thead = 53;
  int E_ul = 54;
  int E_i = 55;
  int E_pre = 56;
  int E_optgroup = 57;
  int E_img = 58;
  int E_caption = 59;
  int E_b = 60;
  int E_a = 61;
  int E_br = 62;
  int E_style = 63;
  int E_hr = 64;
  int E_param = 65;
  int E_table = 66;
  int E_tt = 67;
  int E_tr = 68;
  int E_th = 69;
  int E_td = 70;
  int E_samp = 71;
  int E_tfoot = 72;
  int E_dfn = 73;
  int E_noscript = 74;
  int E_colgroup = 75;
  int E_object = 76;
  int E_sup = 77;
  int E_h6 = 78;
  int E_h5 = 79;
  int E_h4 = 80;
  int E_h3 = 81;
  int E_h2 = 82;
  int E_h1 = 83;
  int E_sub = 84;
  int E_acronym = 85;
  int E_select = 86;
  int E_del = 87;
  int E_li = 88;
  int E_cite = 89;
  int E_var = 90;
  int E_legend = 91;
  int E_abbr = 92;
  int E_input = 93;
  int E_address = 94;
  int ATTR_NAME = 96;
  int ELEMENT_END = 97;
  int QEND = 98;
  int SLASHEND = 99;
  int ATTR_EQ = 100;
  int ATTR_VAL = 101;
  int COMMENT_END = 103;
  int PI_END = 105;
  int CDEND = 107;

  int LexCDATA = 0;
  int LexPI = 1;
  int LexComment = 2;
  int LexElement_Inside = 3;
  int LexElement_Start = 4;
  int DEFAULT = 5;

  String[] tokenImage = {
    "<EOF>",
    "<ALPHA_CHAR>",
    "<NUM_CHAR>",
    "<ALPHANUM_CHAR>",
    "<IDENTIFIER_CHAR>",
    "<IDENTIFIER>",
    "<QUOTED_STRING_NB>",
    "<QUOTED_STRING>",
    "<WHITESPACE>",
    "<NEWLINE>",
    "<QUOTE>",
    "\"<?xml\"",
    "\"<\"",
    "\"</\"",
    "\"<?\"",
    "\"<!--\"",
    "\"<![CDATA[\"",
    "<PCDATA>",
    "\"html\"",
    "\"button\"",
    "\"textarea\"",
    "\"em\"",
    "\"small\"",
    "\"area\"",
    "\"bdo\"",
    "\"form\"",
    "\"link\"",
    "\"label\"",
    "\"dt\"",
    "\"span\"",
    "\"title\"",
    "\"strong\"",
    "\"script\"",
    "\"div\"",
    "\"dl\"",
    "\"blockquote\"",
    "\"kbd\"",
    "\"body\"",
    "\"ins\"",
    "\"map\"",
    "\"dd\"",
    "\"fieldset\"",
    "\"head\"",
    "\"col\"",
    "\"base\"",
    "\"big\"",
    "\"meta\"",
    "\"code\"",
    "\"tbody\"",
    "\"option\"",
    "\"q\"",
    "\"p\"",
    "\"ol\"",
    "\"thead\"",
    "\"ul\"",
    "\"i\"",
    "\"pre\"",
    "\"optgroup\"",
    "\"img\"",
    "\"caption\"",
    "\"b\"",
    "\"a\"",
    "\"br\"",
    "\"style\"",
    "\"hr\"",
    "\"param\"",
    "\"table\"",
    "\"tt\"",
    "\"tr\"",
    "\"th\"",
    "\"td\"",
    "\"samp\"",
    "\"tfoot\"",
    "\"dfn\"",
    "\"noscript\"",
    "\"colgroup\"",
    "\"object\"",
    "\"sup\"",
    "\"h6\"",
    "\"h5\"",
    "\"h4\"",
    "\"h3\"",
    "\"h2\"",
    "\"h1\"",
    "\"sub\"",
    "\"acronym\"",
    "\"select\"",
    "\"del\"",
    "\"li\"",
    "\"cite\"",
    "\"var\"",
    "\"legend\"",
    "\"abbr\"",
    "\"input\"",
    "\"address\"",
    "<token of kind 95>",
    "<ATTR_NAME>",
    "\">\"",
    "\"?>\"",
    "\"/>\"",
    "\"=\"",
    "<ATTR_VAL>",
    "<token of kind 102>",
    "\"-->\"",
    "<token of kind 104>",
    "\"?>\"",
    "<token of kind 106>",
    "\"]]>\"",
  };

}
