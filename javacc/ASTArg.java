/* Generated By:JJTree: Do not edit this line. ASTArg.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTArg extends SimpleNode {
  String ast_type;
  String ast_id;

  public ASTArg(int id) {
    super(id);
  }

  public ASTArg(Compiler p, int id) {
    super(p, id);
  }

  public int process(String className) {
    SymbolVar symbol = new SymbolVar(ast_id, ast_type);
    symbol.initialize();
    putSymbolInTable(symbol);

    return 1;
  }

}
/* JavaCC - OriginalChecksum=0bf41f7424a5b64a4a6b4c45fe0012b6 (do not edit this line) */
