/* Generated By:JJTree: Do not edit this line. ASTObject.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTObject extends SimpleNode {
  public ASTObject(int id) {
    super(id);
  }

  public ASTObject(Compiler p, int id) {
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

  public String getNodeType() {
    return this.getClass().toString();
  }
}
/* JavaCC - OriginalChecksum=fdc7b288391d11055e1bc77fbb789925 (do not edit this line) */
