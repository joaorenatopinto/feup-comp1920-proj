import java.util.List;

/* Generated By:JJTree: Do not edit this line. ASTMethodDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTMethodDeclaration extends SimpleNode {


  public ASTMethodDeclaration(int id) {
    super(id);
  }

  public ASTMethodDeclaration(Compiler p, int id) {
    super(p, id);
  }

  
  @Override
  public int process() {//TODO: ir buscar os argumentos aos fihos
    List<String> arroz;
    /*for ( SimpleNode child : this.children ) {
       arroz.add(child.process());
    }*/
    //SemanticProcessor.methods_table.put(ast_id, new SymbolMethod(ast_id, ast_return_type));
    return 1;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

}
/* JavaCC - OriginalChecksum=05fea3f0d6b32bf64f2c307d3069ee4c (do not edit this line) */
