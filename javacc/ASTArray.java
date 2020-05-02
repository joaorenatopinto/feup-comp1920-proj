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
  public int process(String className) {
    SimpleNode child = ((SimpleNode)this.children[0]);
    child.process(className);
    
    if (!child.getType().equals(Symbol.INT)){
      throw new RuntimeException("ASTArray size not a INT" + "\nLine: " + this.line + "; Col: " + this.column);
    }

    return 1;
  }

  public String getType(){
    return Symbol.INT_ARRAY; // TODO boolean array?
  }

  public String generateCode(String className){
    // System.out.println("CodeGenerator " + this.getClass() + " : SIMPLENODE");
    String code = "";

    code += ((SimpleNode)this.children[0]).generateCode(className);

    code += "newarray int\n";

    return code;
  }

}
/* JavaCC - OriginalChecksum=dfd7c194a9e81f0ae42693455694e768 (do not edit this line) */
