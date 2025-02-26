/* Generated By:JJTree: Do not edit this line. ASTStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTStatement extends SimpleNode {
  public ASTStatement(int id) {
    super(id);
  }

  public ASTStatement(Compiler p, int id) {
    super(p, id);
  }


  @Override
  public int process(String className) {
    System.out.println(this.getClass());
    if (this.children == null) return 1;
    for(int i = 0; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process(className);
    }
    return 1;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

  public String generateCode(String className){
    // System.out.println("CodeGenerator " + this.getClass() + " : SIMPLENODE");
    String code = "";
    if (this.children != null)
      for(int i = 0; i < this.children.length; i++) {
        if (!(this.children[i] instanceof ASTElse))
          code += ((SimpleNode)this.children[i]).generateCode(className);
        System.out.println("TYYYYPE: " + ((SimpleNode)this.children[i]).getType());
        if (!((SimpleNode)this.children[i]).getType().equals("ERROR SimpleNode") &&
        !((SimpleNode)this.children[i]).getType().equals("void")){
          code += "pop\n";
          CodeGenerator.decStack(1, this);
        }
      }

    return code;
  }

}
/* JavaCC - OriginalChecksum=6bd0657f0f8b1cd87c74ca9d0f191615 (do not edit this line) */
