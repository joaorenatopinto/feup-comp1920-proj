/* Generated By:JJTree: Do not edit this line. ASTAcessArray.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTAcessArray extends SimpleNode {
  String ast_identifier;
  
  public ASTAcessArray(int id) {
    super(id);
  }

  public ASTAcessArray(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process() {

    SimpleNode child = (SimpleNode)this.children[0];
    child.process();

    Symbol symbol = getSymbolFromTable(ast_identifier);

    if (symbol == null)
      throw new RuntimeException("ASTAcessArray: " + ast_identifier + " is not previous declared");

      // TODO check if symbol is array?

    if (child.getType() != Symbol.INT){
      throw new RuntimeException("ASTAcessArray is not a Integer");
    }
    
    return 1;
  }

  public String getType(){
    Symbol symbol = getSymbolFromTable(ast_identifier);

    if (symbol == null)
      return ast_identifier + " not initialized";

    if (symbol.type.equals(Symbol.INT_ARRAY))
      return Symbol.INT;

    return "ERROR: weird type of array";
  }

}
/* JavaCC - OriginalChecksum=c486535c6ff220f48d2a53e89df3a0a9 (do not edit this line) */