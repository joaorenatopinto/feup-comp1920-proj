/* Generated By:JJTree: Do not edit this line. ASTInt.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTInt extends SimpleNode {
  public int ast_value;

  public ASTInt(int id) {
    super(id);
  }

  public ASTInt(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process(String className) {
    return ast_value;
  }

  public String getType(){
    return Symbol.INT;
  }

  public String generateCode(String className){
    String code = "";

    if(ast_value >= 0 && ast_value <= 5) {
      code += "iconst_" + ast_value + "\n";
    } else if (ast_value == -1){
      code += "iconst_m1\n";
    } else if(ast_value >= -127 && ast_value <= 128){
      code += "bipush " + ast_value + "\n";
    } else if(ast_value >= -32768 && ast_value <= 32767) {
      code += "sipush " + ast_value + "\n";
    } else {
      code += "ldc " + ast_value + "\n";
    }
    CodeGenerator.incStack(this);

    return code;
  }

}
/* JavaCC - OriginalChecksum=bb1b1031a7ba96402230e94bfa7be433 (do not edit this line) */
