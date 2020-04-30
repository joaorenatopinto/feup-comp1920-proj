/* Generated By:JJTree: Do not edit this line. ASTSub.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTSub extends SimpleNode {
  public ASTSub(int id) {
    super(id);
  }

  public ASTSub(Compiler p, int id) {
    super(p, id);
  }

 
  @Override
  public int process(String className) {

    SimpleNode left = (SimpleNode)this.children[0];
    SimpleNode right = (SimpleNode)this.children[1];

    left.process(className);
    right.process(className);

    if (!left.getType().equals(Symbol.INT) || !right.getType().equals(Symbol.INT)){
      throw new RuntimeException("ASTSub is not a Integer (" + left.getType() + ", " + right.getType() + ")");
    }
    
    return 1;
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

    code += "isub\n";

    return code;
  }

}
/* JavaCC - OriginalChecksum=eddc764b75eee724cb26e25a44bb7deb (do not edit this line) */
