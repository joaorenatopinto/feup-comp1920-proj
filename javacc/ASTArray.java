/* Generated By:JJTree: Do not edit this line. ASTArray.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTArray extends SimpleNode {
  public ASTArray(int id) {
    super(id);
  }

  public ASTArray(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process() {
    SimpleNode child = ((SimpleNode)this.children[0]);
    return child.process();
  }

  public String getType(){
    return Symbol.INT_ARRAY; // TODO boolean array?
  }

}
/* JavaCC - OriginalChecksum=dfd7c194a9e81f0ae42693455694e768 (do not edit this line) */
