/* Generated By:JJTree: Do not edit this line. ASTImportDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.*;

public class ASTImportDeclaration extends SimpleNode {
  boolean isStatic;
  String ast_className;
  String methodName;
  String returnType;

  public ASTImportDeclaration(int id) {
    super(id);
  }

  public ASTImportDeclaration(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process(String className) {
    System.out.println(this.getClass());
    List<Symbol> args = new ArrayList<>();

    if(this.children!=null && ((SimpleNode)this.children[0]).children != null) {
      for (int j = 0; j < ((SimpleNode)this.children[0]).children.length; j++) {
        ASTImportArg arg = (ASTImportArg)((SimpleNode)(this.children[0])).children[j];
        String type = arg.ast_type;
        SymbolVar symbol = new SymbolVar(null, type);
        args.add(symbol);
      }
    }

    if(methodName!=null) putSymbolInTable(new SymbolMethod(methodName, returnType, ast_className, args));
    else {
      putSymbolInTable(new SymbolClass(ast_className, "Class", null));
    }

    if (this.children == null) return 1;
    for(int i = 0; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process(className);
    }
    return 1;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

}
/* JavaCC - OriginalChecksum=86993ffe1259d54573d5e2a8c410b5ae (do not edit this line) */
