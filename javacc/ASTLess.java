/* Generated By:JJTree: Do not edit this line. ASTLess.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTLess extends SimpleNode {
  public ASTLess(int id) {
    super(id);
  }

  public ASTLess(Compiler p, int id) {
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
      if (SemanticProcessor.types_table.get(left.ast_value) == null)
        throw new RuntimeException("Variable in ASTIdentifier not previous declared");
      // left = ()
      if (SemanticProcessor.types_table.get(left.ast_value) == "Integer")
        left_val = SemanticProcessor.values_table.get(left.ast_value);
      else
        throw new RuntimeException("Left child (" + left.ast_value + ") in ASTLess is not an Integer");
    }
    else {
      SimpleNode left = (SimpleNode)this.children[0];
      left_val = left.process();
    }

    if(this.children[1].getClass().equals(ASTIdentifier.class)) {
      ASTIdentifier right = (ASTIdentifier)this.children[1];
      if (SemanticProcessor.types_table.get(right.ast_value) == "Integer")
        right_val = SemanticProcessor.values_table.get(right.ast_value);
      else
        throw new RuntimeException("Right child (" + right.ast_value + ") in ASTLess is not an Integer");
    }
    else{
      SimpleNode right = (SimpleNode)this.children[1];
      right_val = right.process();
    } 
    

    if(left_val < right_val) return 1;
    else return 0;
  }


}
/* JavaCC - OriginalChecksum=55151cda9b74838fc120e731d3367712 (do not edit this line) */
