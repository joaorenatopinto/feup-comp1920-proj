/* Generated By:JJTree: Do not edit this line. ASTIf.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTIf extends SimpleNode {
  public ASTIf(int id) {
    super(id);
  }

  public ASTIf(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process() {
    int left_val;
    // int right_val;
    if(this.children[0].getClass().equals(ASTIdentifier.class)) {
      ASTIdentifier left = (ASTIdentifier)this.children[0];
      if (SemanticProcessor.symbols_table.get(left.ast_value) == null)
        throw new RuntimeException("Variable in ASTIf not previous declared");

      Symbol left_sym = SemanticProcessor.symbols_table.get(left.ast_value);
      
      if (left_sym.type.equals("boolean")) {
        if (left_sym.init) {
          left_val = left_sym.value;
        } else throw new RuntimeException("Variable " + left.ast_value + " was not initialized");
      } else throw new RuntimeException("Left child (" + left.ast_value + ") in ASTIf is not a Boolean");
    }
    else {
      SimpleNode left = (SimpleNode)this.children[0];
      left_val = left.process();
    }
    for (int i = 1; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process();
    }
    return 1;
  }
}
/* JavaCC - OriginalChecksum=9b2b06fe1f37a5c88d35bf1701a179f5 (do not edit this line) */
