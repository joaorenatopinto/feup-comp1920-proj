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
  public int process() {
    //SimpleNode left = (SimpleNode)this.children[0];
    //SimpleNode right = (SimpleNode)this.children[1];
    int left_val;
    int right_val;

    if(this.children[0].getClass().equals(ASTIdentifier.class)) {
      Symbol left_sym;
      ASTIdentifier left = (ASTIdentifier)this.children[0];
      if (SemanticProcessor.insideMethod && SemanticProcessor.methods_symbols_table.get(left.ast_value) != null) {
        left_sym = SemanticProcessor.methods_symbols_table.get(left.ast_value);
      }
      else if(SemanticProcessor.symbols_table.get(left.ast_value) != null) {
        left_sym = SemanticProcessor.symbols_table.get(left.ast_value);
      }
      else throw new RuntimeException("Variable in ASTAdd not previous declared (" + left.ast_value + ")");
      

      if (left_sym.type.equals("int")) {
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
      Symbol right_sym;
      ASTIdentifier right = (ASTIdentifier)this.children[1];
      if (SemanticProcessor.insideMethod && SemanticProcessor.methods_symbols_table.get(right.ast_value) != null) {
        right_sym = SemanticProcessor.methods_symbols_table.get(right.ast_value);
      }
      else if(SemanticProcessor.symbols_table.get(right.ast_value) != null) {
        right_sym = SemanticProcessor.symbols_table.get(right.ast_value);
      }
      else throw new RuntimeException("Variable in ASTIdentifier not previous declared");

      if (right_sym.type.equals("int")) {
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
    

    return left_val - right_val;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

}
/* JavaCC - OriginalChecksum=eddc764b75eee724cb26e25a44bb7deb (do not edit this line) */
