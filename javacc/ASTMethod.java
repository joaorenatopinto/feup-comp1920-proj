/* Generated By:JJTree: Do not edit this line. ASTMethod.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.*;
import java.io.*;

public
class ASTMethod extends SimpleNode {
  public String ast_id;
  public String ast_type;

  public int id_variables_jasmin;

  public HashMap<String, Symbol> symbols_table = new HashMap<String, Symbol>();

  public ASTMethod(int id) {
    super(id);
    id_variables_jasmin = 1;
  }

  public ASTMethod(Compiler p, int id) {
    super(p, id);
    id_variables_jasmin = 1;
  }

  @Override
  public int process(String className) {
    System.out.println(this.getClass());
    SimpleNode curr_node;
    for (int i = 0; i < this.children.length; i++) {
      curr_node = (SimpleNode)this.children[i];
      curr_node.process(className);
    }

    //  Check return type

    if (!((SimpleNode)this.children[this.children.length-1]).getType().equals(ast_type)){
      throw new RuntimeException("ASTMethod return type does not match (" + 
      ((SimpleNode)this.children[this.children.length-1]).getType() + ", " + ast_type + ")" + "\nLine: " + this.line + "; Col: " + this.column);
    }

    return 1;
  }

  public void preProcess(String className){
    List<Symbol> args = new ArrayList<>();

    // if(!((SimpleNode)this.children[0] instanceof ASTMethodArgs))
    //   return;

    if(((SimpleNode)this.children[0] instanceof ASTMethodArgs))
      if(((SimpleNode)this.children[0]).children != null) {
        for (int j = 0; j < ((SimpleNode)this.children[0]).children.length; j++) {
          ASTArg arg = (ASTArg)((SimpleNode)(this.children[0])).children[j];
          String type = arg.ast_type;
          String identifier = arg.ast_id;
          SymbolVar symbol = new SymbolVar(identifier, type);
          symbol.initialize();
          args.add(symbol);
        }
      }

    putSymbolInTable(new SymbolMethod(ast_id, ast_type, className, args));
    System.out.println(symbols_table);
    System.out.println("!");
  }


  public String generateCode(String className){

    String code = ".method public " + ast_id + "(";

    List<String> args = new ArrayList<>();
    if(((SimpleNode)this.children[0] instanceof ASTMethodArgs))
      if(((SimpleNode)this.children[0]).children != null) {
        for (int j = 0; j < ((SimpleNode)this.children[0]).children.length; j++) {
          ASTArg arg = (ASTArg)((SimpleNode)(this.children[0])).children[j];
          String type = arg.ast_type;
          args.add(type);
        }
      }

    for (int i = 0; i < args.size(); i++){
      code += SimpleNode.getTypeJasmin(args.get(i));
    }

    code += ")" + SimpleNode.getTypeJasmin(ast_type) + "\n";

    code += ".limit stack 99\n";
    code += ".limit locals 99\n";

    if (this.children != null)
      for(int i = 0; i < this.children.length; i++) {
        code += ((SimpleNode)this.children[i]).generateCode(className);
      }

    if (ast_type != null) {
      switch (ast_type) {
        case "bool":
          code += "ireturn\n";
          break;
        case "int":
          code += "ireturn\n";
          break;
        case "void":
          code += "return\n";
          break;
        default:
          code += "areturn\n";
          break;
      }

    }
    code += ".end method\n\n";

    return code;
  }
  
}
/* JavaCC - OriginalChecksum=dee4677a4569967c602fa79e0250dbf5 (do not edit this line) */
