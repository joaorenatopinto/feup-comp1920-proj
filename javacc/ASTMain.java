/* Generated By:JJTree: Do not edit this line. ASTMain.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.*;
import java.io.*;

public
class ASTMain extends SimpleNode {

  public HashMap<String, Symbol> symbols_table = new HashMap<String, Symbol>();

  public int id_variables_jasmin;

  public ASTMain(int id) {
    super(id);
    id_variables_jasmin = 1;
  }

  public ASTMain(Compiler p, int id) {
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
    return 1;
  }

  public void preProcess(String className){
    List<Symbol> args = new ArrayList<>();
    args.add(new SymbolVar("args", "String[]"));
    putSymbolInTable(new SymbolMethod("Main", "void", className, args, true));
  }

  public String generateCode(String className){
    CodeGenerator.resetStack();

    String prefix = ".method static public main([Ljava/lang/String;)V\n";
    String code = "";

    if (this.children != null)
      for(int i = 0; i < this.children.length; i++) {
        code += ((SimpleNode)this.children[i]).generateCode(className);
      }

    code += "return\n.end method\n\n";


    prefix += ".limit stack "+ CodeGenerator.maxStack + "\n";
    prefix += ".limit locals 99\n";

    return (prefix + code);
  }

}
/* JavaCC - OriginalChecksum=58f127b3047114438a993e42197cc3f7 (do not edit this line) */
