/* Generated By:JJTree: Do not edit this line. ASTElse.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTElse extends SimpleNode {
  public ASTElse(int id) {
    super(id);
  }

  public ASTElse(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process() {
    for (int i = 0; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process();
    }
    return 1;
  }



}
/* JavaCC - OriginalChecksum=746407fe194e9657eb60ee77424cc0af (do not edit this line) */
