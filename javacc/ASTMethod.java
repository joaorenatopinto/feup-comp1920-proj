/* Generated By:JJTree: Do not edit this line. ASTMethod.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.ArrayList;
import java.util.List;

public
class ASTMethod extends SimpleNode {
  public String ast_id;
  public String ast_type;

  public ASTMethod(int id) {
    super(id);
  }

  public ASTMethod(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process() {
    SemanticProcessor.insideMethod = true;
    //List<Symbol> method_args = new ArrayList<>();
    
    for (int i = 0; i < ((SimpleNode)this.children[0]).children.length; i++) {
      ASTArg arg = (ASTArg)((SimpleNode)this.children[0]).children[i];
      String type = arg.ast_type;
      String identifier = arg.ast_id;
      if(type.equals("int[]")) {
        SymbolArray curSymbol = new SymbolArray(identifier);
        curSymbol.initialize(0);
        SemanticProcessor.methods_arrays_table.put(identifier, curSymbol);
        //method_args.add(curSymbol);
      } else {
        Symbol curSymbol = new Symbol(identifier, type);
        curSymbol.initialize(0);
        SemanticProcessor.methods_symbols_table.put(identifier, curSymbol);
        //method_args.add(curSymbol);
      }    
    }
    
    //SemanticProcessor.methods_table.put(ast_id, new SymbolMethod(ast_id, ast_type, method_args));

    SimpleNode curr_node;
    for (int i = 1; i < this.children.length; i++) {
      curr_node = (SimpleNode)this.children[i];
      curr_node.process();
    }

    System.out.println(this.id + ": ");
    System.out.println(SemanticProcessor.methods_symbols_table);
    System.out.println(SemanticProcessor.methods_arrays_table);
    System.out.println("~~~~~~~");

    SemanticProcessor.methods_symbols_table.clear();
    SemanticProcessor.methods_arrays_table.clear();
    SemanticProcessor.insideMethod = false;

    return 1;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }
  
}
/* JavaCC - OriginalChecksum=dee4677a4569967c602fa79e0250dbf5 (do not edit this line) */
