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
  public int process() {
    return ast_value;
  }


}
/* JavaCC - OriginalChecksum=bb1b1031a7ba96402230e94bfa7be433 (do not edit this line) */
