/* Generated By:JJTree: Do not edit this line. ASTAdd.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTAdd extends SimpleNode {
  public ASTAdd(int id) {
    super(id);
  }

  public ASTAdd(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process() {
    //SimpleNode left = (SimpleNode)this.children[0];
    //SimpleNode right = (SimpleNode)this.children[1];
    int left_val;
    int right_val;

    if(this.children[0].getClass().equals(ASTIdentifier.class)) {
      ASTIdentifier left = (ASTIdentifier)this.children[0];
      if (SemanticProcessor.symbols_table.get(left.ast_value) == null)
        throw new RuntimeException("Variable in ASTIdentifier not previous declared");
      
      Symbol left_sym = SemanticProcessor.symbols_table.get(left.ast_value);

      if (left_sym.type == "int") {
        if (left_sym.init) {
          left_val = left_sym.value;
        } else throw new RuntimeException("Variable " + left.ast_value + " was not initialized");
      } else throw new RuntimeException("Left child (" + left.ast_value + ") in ASTLess is not an Integer");
    } //else if(arrayacess){}
    else {
      SimpleNode left = (SimpleNode)this.children[0];
      left_val = left.process();
    }

    if(this.children[1].getClass().equals(ASTIdentifier.class)) {
      ASTIdentifier right = (ASTIdentifier)this.children[1];
      if (SemanticProcessor.symbols_table.get(right.ast_value) == null)
        throw new RuntimeException("Variable in ASTIdentifier not previous declared");

      Symbol right_sym = SemanticProcessor.symbols_table.get(right.ast_value);

      if (right_sym.type == "int") {
        if (right_sym.init) {
          right_val = right_sym.value;
        }else throw new RuntimeException("Variable " + right.ast_value + " was not initialized");
      }
      else
        throw new RuntimeException("Right child (" + right.ast_value + ") in ASTLess is not an Integer");
    } //else if(arrayacess){}
    else{
      SimpleNode right = (SimpleNode)this.children[1];
      right_val = right.process();
    } 
    

    return left_val + right_val;
  }



}
/* JavaCC - OriginalChecksum=80a71ab8e00fa3a5afb551a1b463c78a (do not edit this line) */
