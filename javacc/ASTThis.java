/* Generated By:JJTree: Do not edit this line. ASTThis.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTThis extends SimpleNode {
  String curClass = null;

  public ASTThis(int id) {
    super(id);
  }

  public ASTThis(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process(String className) {
    curClass = className;

    SimpleNode node = (SimpleNode) this.parent;
    while (node != null){
      if (node instanceof ASTMain){
        throw new RuntimeException("This cant be used in a static context" + "\nLine: " + this.line + "; Col: " + this.column);
      }  
      node = (SimpleNode) node.parent;
    }

    if (curClass == null)
      throw new RuntimeException("This cant be used in this context" + "\nLine: " + this.line + "; Col: " + this.column);

    System.out.println(this.getClass());
    if (this.children == null) return 1;
    for(int i = 0; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process(className);
    }
    return 1;
  }

  public String getType(){ // TODO

    if (curClass != null)
      return curClass;

    return "ERROR: THIS NOT IN GOOD CONTEXT";
  }

}
/* JavaCC - OriginalChecksum=92c995de9628d38c8dea47cb7b4e2f95 (do not edit this line) */
