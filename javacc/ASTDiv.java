  /* Generated By:JJTree: Do not edit this line. ASTDiv.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTDiv extends SimpleNode {
  public ASTDiv(int id) {
    super(id);
  }

  public ASTDiv(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process(String className) {

    SimpleNode left = (SimpleNode)this.children[0];
    SimpleNode right = (SimpleNode)this.children[1];
    // int left_val;
    // int right_val;
    left.process(className);
    right.process(className);

    if (!left.getType().equals(Symbol.INT) || !right.getType().equals(Symbol.INT)){
      throw new RuntimeException("ASTDiv is not a Integer (" + left.getType() + ", " + right.getType() + ")" + "\nLine: " + this.line + "; Col: " + this.column);
    }
    
    return 1;


    // return left_val / right_val;
  }

  public String getType(){
    return Symbol.INT;
  }

  public String generateCode(String className){
    // System.out.println("CodeGenerator " + this.getClass() + " : SIMPLENODE");
    String code = "";
    if (this.children != null)
      for(int i = 0; i < this.children.length; i++) {
        code += ((SimpleNode)this.children[i]).generateCode(className);
      }

    code += "idiv\n";

    CodeGenerator.decStack(1,this);

    return code;
  }

}
/* JavaCC - OriginalChecksum=a5403788ff3e0338429f3a63033fbeab (do not edit this line) */
