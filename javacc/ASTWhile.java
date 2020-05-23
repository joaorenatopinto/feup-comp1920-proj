/* Generated By:JJTree: Do not edit this line. ASTWhile.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTWhile extends SimpleNode {
  public ASTWhile(int id) {
    super(id);
  }

  public ASTWhile(Compiler p, int id) {
    super(p, id);
  }


  @Override
  public int process(String className) {

    SimpleNode child = (SimpleNode)this.children[0];

    child.process(className);

    for (int i = 1; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process(className);
    }

    if (!child.getType().equals(Symbol.BOOLEAN)){
      throw new RuntimeException("ASTWhile is not a Boolean" + "\nLine: " + this.line + "; Col: " + this.column);
    }
    
    return 1;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

  public String generateCode(String className){

    String code = "";
    String loop1 = "loop" + CodeGenerator.loopNumber++;
    String loop2 = "loop" + CodeGenerator.loopNumber++;
    
    code += loop2 + ":\n";
    //COMPARAÇÃO
    code += ((SimpleNode)this.children[0]).generateCode(className);
    // IF CONDITION IS FALSE EXIT LOOP
    code += "ifeq " + loop1 + "\n";
    CodeGenerator.decStack(1,this);
    // LOOP CODE
    code += ((SimpleNode)this.children[1]).generateCode(className);
    // COMPARE AGAIN (loop2)
    code += "goto " + loop2 + "\n";
    // OUT OF LOOP
    code += loop1 + ":\n";

    return code;
  }


}
/* JavaCC - OriginalChecksum=f28cfb0ffed7c8f52b380412137c970b (do not edit this line) */
