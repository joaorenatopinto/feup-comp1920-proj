/* Generated By:JJTree: Do not edit this line. ASTIf.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTIf extends SimpleNode {
  public ASTIf(int id) {
    super(id);
  }

  public ASTIf(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process(String className) {

    SimpleNode child = (SimpleNode)this.children[0];
    // int left_val;
    // int right_val;
    child.process(className);

    for (int i = 1; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process(className);
    }

    if (!child.getType().equals(Symbol.BOOLEAN)){
      throw new RuntimeException("ASTIf is not a Boolean" + "\nLine: " + this.line + "; Col: " + this.column);
    }
    
    return 1;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

}
/* JavaCC - OriginalChecksum=9b2b06fe1f37a5c88d35bf1701a179f5 (do not edit this line) */