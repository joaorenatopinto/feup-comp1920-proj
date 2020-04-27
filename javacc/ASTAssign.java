/* Generated By:JJTree: Do not edit this line. ASTAssign.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTAssign extends SimpleNode {
  public String identifier;

  public ASTAssign(int id) {
    super(id);
  }

  public ASTAssign(Compiler p, int id) {
    super(p, id);
  }

  public int process(String className) {
    System.out.println(this.getClass());

    int index = 0;

    if (this.children.length == 2){
      ((SimpleNode)this.children[0]).process(className);
      index++;
    }

    SimpleNode child = (SimpleNode)this.children[index];

    child.process(className);

    Symbol symbolLeft = getSymbolFromTable(identifier);

    if( !(symbolLeft.type.equals(Symbol.INT_ARRAY) ) ) {
      if (symbolLeft == null)
        throw new RuntimeException("ASTAssign: Variable (" + identifier + ") not previous declared");

      if (!child.getType().equals(symbolLeft.type)){
        throw new RuntimeException("ASTAssign is not equal (" + symbolLeft.type + ", " + child.getType() + ")");
      }

      SymbolVar var = (SymbolVar) symbolLeft;
      var.initialize();
    }
    else {
      SymbolVar var = (SymbolVar) symbolLeft;
      
      if( child.getType().equals(Symbol.INT_ARRAY) ) { // se estiver a ser inicializado
        if( var.isInitialized )
          throw new RuntimeException("ASTAssign: int[] (" + symbolLeft.identifier + ") already had been initialized.");
        else
          var.initialize();
      }
      else if ( var.isInitialized ) { // se estiver inicializado
        if( !child.getType().equals(Symbol.INT) ) { // se nao for int
          throw new RuntimeException("ASTAssign: int[] (" + symbolLeft.identifier + ") can only store int types.");
        }
      }
      else { // se n estiver inicializado
        throw new RuntimeException("ASTAssign: int[] (" + symbolLeft.identifier + ") has not been initialized.");
      }
    }
    
    return 1;

    // SimpleNode left = (SimpleNode)this.children[0];
    // SimpleNode right = (SimpleNode)this.children[1];
    // int left_val;
    // int right_val;
    // left.process(className);
    // right.process(className);



    // SimpleNode left = null;
    // SimpleNode right = null;
    
    // if(this.children.length == 2) {
    //   left = ((SimpleNode)this.children[0]);
    //   right = ((SimpleNode)this.children[1]);
    // }
    // else {
    //   right = ((SimpleNode)this.children[0]);
    // }

    // Symbol symbol_obj = null;
    // SymbolArray array_obj = null;
 
    // System.out.println(identifier);
    // if (SemanticProcessor.insideMethod && SemanticProcessor.methods_symbols_table.get(identifier) != null)
    //   symbol_obj = SemanticProcessor.methods_symbols_table.get(identifier);
    // else if (SemanticProcessor.insideMethod && SemanticProcessor.methods_arrays_table.get(identifier) != null)
    //   array_obj = SemanticProcessor.methods_arrays_table.get(identifier);
    // else if (SemanticProcessor.symbols_table.get(identifier) != null)
    //   symbol_obj = SemanticProcessor.symbols_table.get(identifier);
    // else if (SemanticProcessor.arrays_table.get(identifier) != null)
    //   array_obj = SemanticProcessor.arrays_table.get(identifier);
    // else 
    //   throw new RuntimeException("Variable in ASTAssign (" + identifier + ") not previous declared");
      
    // int right_return = right.process(className);

    // if(symbol_obj!=null && symbol_obj.type.equals("boolean") && right_return != 0 && right_return != 1) {
    //   throw new RuntimeException("Afonso não gosta de falsos, se dizes que és bool, tens de ser");
    // }
    // else if(array_obj!=null && array_obj.type.equals("int[]")) {
    //   if(right.getClass() == ASTArray.class){
    //     array_obj.initialize(right.process(className));
    //   }
    //   else {
    //     array_obj.assignValueToIndex(left.process(className), right.process(className));
    //     System.out.println("Dei assign a " + left.process(className)  +" o valor " + right.process(className));
    //   }
    // }
    // else {
    //   symbol_obj.initialize(right_return);
    // }

    // return 1;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

}
/* JavaCC - OriginalChecksum=4793199788c28cc272f0923738dc0777 (do not edit this line) */
