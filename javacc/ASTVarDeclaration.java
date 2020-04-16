/* Generated By:JJTree: Do not edit this line. ASTVarDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTVarDeclaration extends SimpleNode {
  public String ast_id;
  public String ast_type;

  public ASTVarDeclaration(int id) {
    super(id);
  }

  public ASTVarDeclaration(Compiler p, int id) {
    super(p, id);
  }

  
  @Override
  public int process() {
    if(ast_type == "int[]")
      SemanticProcessor.symbols_table.put(ast_id, new SymbolArray(ast_id));
    else
      SemanticProcessor.symbols_table.put(ast_id, new Symbol(ast_id, ast_type));
    return 1;
  }

}
/* JavaCC - OriginalChecksum=5159ccc9095207e91ac101c5c6843086 (do not edit this line) */
