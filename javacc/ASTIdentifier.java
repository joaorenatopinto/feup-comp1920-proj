/* Generated By:JJTree: Do not edit this line. ASTIdentifier.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTIdentifier extends SimpleNode {
  public String ast_value;

  public ASTIdentifier(int id) {
    super(id);
  }

  public ASTIdentifier(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process() {
    System.out.println(this.getClass());
    if (this.children == null) return 1;
    for(int i = 0; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process();
    }
    return 1;
  }

  public String getType(){ 
    Symbol symbol = getSymbolFromTable(ast_value);

    if (symbol == null)
      return ast_value + " not initialized";

    return symbol.type;
  }

}
/* JavaCC - OriginalChecksum=7e952cd1fd5beaef4dc07a9cecd7720b (do not edit this line) */
