/* Generated By:JJTree: Do not edit this line. ASTMul.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTMul extends SimpleNode {
  public ASTMul(int id) {
    super(id);
  }

  public ASTMul(Compiler p, int id) {
    super(p, id);
  }

  
  
  @Override
  public int process() {
    SimpleNode left = (SimpleNode)this.children[0];
    SimpleNode right = (SimpleNode)this.children[1];
    return left.process() * right.process();
    /*
    System.out.println(this.getClass());
    if (this.children == null) return 1;
    for(int i = 0; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process();
    }
    return 1;
    */
  }


}
/* JavaCC - OriginalChecksum=527e8cfe6da7f441329c9e9dfcd06281 (do not edit this line) */
