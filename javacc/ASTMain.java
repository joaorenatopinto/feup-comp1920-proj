/* Generated By:JJTree: Do not edit this line. ASTMain.java Version 6.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.*;
import java.io.*;

public
class ASTMain extends SimpleNode {

  public HashMap<String, Symbol> symbols_table = new HashMap<String, Symbol>();

  public ASTMain(int id) {
    super(id);
  }

  public ASTMain(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process() {
    System.out.println(this.getClass());
    
    SimpleNode curr_node;
    for (int i = 0; i < this.children.length; i++) {
      curr_node = (SimpleNode)this.children[i];
      curr_node.process();
    }
    return 1;
  }

  public void preProcess(String className){
    List<Symbol> args = new ArrayList<>();
    args.add(new SymbolVar("args", "String[]"));
    putSymbolInTable(new SymbolMethod("Main", "void", className, args));
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

}
/* JavaCC - OriginalChecksum=58f127b3047114438a993e42197cc3f7 (do not edit this line) */
