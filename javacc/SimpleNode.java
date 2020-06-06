/* Generated By:JJTree: Do not edit this line. SimpleNode.java Version 6.1 */
/* JavaCCOptions:MULTI=false,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.*;

public
class SimpleNode implements Node {

  protected Node parent;
  protected Node[] children;
  protected int id;
  protected Object value;
  protected Compiler parser;

  public int line;
  public int column;

  public SimpleNode(int i) {
    id = i;
  }

  public SimpleNode(Compiler p, int i) {
    this(i);
    parser = p;
  }

  public void jjtOpen() {
  }

  public void jjtClose() {  
  }

  public void jjtSetParent(Node n) { parent = n; }
  public Node jjtGetParent() { return parent; }

  public void jjtAddChild(Node n, int i) {
    if (children == null) {
      children = new Node[i + 1];
    } else if (i >= children.length) {
      Node c[] = new Node[i + 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = n;
  }

  public Node jjtGetChild(int i) {
    return children[i];
  }

  public int jjtGetNumChildren() {
    return (children == null) ? 0 : children.length;
  }

  public void jjtSetValue(Object value) { this.value = value; }
  public Object jjtGetValue() { return value; }

  /* You can override these two methods in subclasses of SimpleNode to
     customize the way the node appears when the tree is dumped.  If
     your output uses more than one line you should override
     toString(String), otherwise overriding toString() is probably all
     you need to do. */

  public String toString() { return CompilerTreeConstants.jjtNodeName[id]; }
  public String toString(String prefix) { return prefix + toString(); }

  /* Override this method if you want to customize how the node dumps
     out its children. */

  public void dump(String prefix) {
    System.out.println(toString(prefix));
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        SimpleNode n = (SimpleNode)children[i];
        if (n != null) {
          n.dump(prefix + " ");
        }
      }
    }
  }
  
  public int getId() {
    return id;
  }

  public void preProcess(String className){
    if(this.children != null) {
      for(int i = 0; i < this.children.length; i++) {
        ((SimpleNode)this.children[i]).preProcess(className);
      }
    }
  }

  public int process(String className) {
    System.out.println(this.getClass() + " : SIMPLENODE");
    if (this.children == null) return 1;
    for(int i = 0; i < this.children.length; i++) {
      ((SimpleNode)this.children[i]).process(className);
    }
    return 1;
  }


  public String getType(){
    return "ERROR SimpleNode";
  }

  public Symbol getSymbolFromTable(String identifier){
    SimpleNode node = (SimpleNode) this.parent;
    Symbol symbol = null;
    while (node != null){

      if (node instanceof ASTMethod){
        symbol = ((ASTMethod)node).symbols_table.get(identifier);
      } else if (node instanceof ASTMain){
        symbol = ((ASTMain)node).symbols_table.get(identifier);
      } else if (node instanceof ASTClassDeclaration){
        symbol = ((ASTClassDeclaration)node).symbols_table.get(identifier);
      } else if (node instanceof ASTStart){
        symbol = ((ASTStart)node).symbols_table.get(identifier);
      }

      if (symbol != null)
        break;
      
      node = (SimpleNode) node.parent;
    }
    return symbol;
  }

  static String createId(String className, String methodName, List<String> args){
    String id = "";
    id += className + "-";
    id += methodName + "-";
    for (int i = 0; i < args.size(); i++){
      id += args.get(i);
      if(i + 1 < args.size())
        id += "-";
    }
    return id;
  }

  public Boolean putSymbolInTable(Symbol symbol){
    SimpleNode node = (SimpleNode) this.parent;

    String id = symbol.identifier;

    if (symbol instanceof SymbolMethod){
      System.out.println("HSIDBASKLHDGPAISUHDOISAUDPOIAHJSNODIUHASP(IUDBASIUDN");
      id = "";
      SymbolMethod method = (SymbolMethod) symbol;
      id += method.className + "-";
      id += method.identifier + "-";
      for (int i = 0; i < method.arguments.size(); i++){
        id += method.arguments.get(i).type;
        if(i + 1 < method.arguments.size())
          id += "-";
      }
    }

    while (node != null){

      if (node instanceof ASTMethod){

        Symbol prev = ((ASTMethod)node).symbols_table.get(symbol.identifier);
        if (prev != null)
          throw new RuntimeException(symbol.identifier + " already has been initialized");
        
          
        symbol.id_jasmin = ((ASTMethod)node).id_variables_jasmin++;

        ((ASTMethod)node).symbols_table.put(id, symbol);
      
        return true;

      } else if (node instanceof ASTMain){

        Symbol prev = ((ASTMain)node).symbols_table.get(symbol.identifier);
        if (prev != null)
          throw new RuntimeException(symbol.identifier + " already has been initialized");

        symbol.id_jasmin = ((ASTMain)node).id_variables_jasmin++;

        ((ASTMain)node).symbols_table.put(id, symbol);
        
        return true;

      } else if (node instanceof ASTClassDeclaration){
        
        Symbol prev = ((ASTClassDeclaration)node).symbols_table.get(symbol.identifier);
        if (prev != null)
          throw new RuntimeException(symbol.identifier + " already has been initialized");


        ((ASTClassDeclaration)node).symbols_table.put(id, symbol);

        return true;

      } else if (node instanceof ASTStart){
        
        Symbol prev = ((ASTStart)node).symbols_table.get(symbol.identifier);
        if (prev != null)
          throw new RuntimeException(symbol.identifier + " already has been initialized");


        ((ASTStart)node).symbols_table.put(id, symbol);

        return true;

      }
      
      node = (SimpleNode) node.parent;
    }
    return false;
  }

  public String generateCode(String className){
    // System.out.println("CodeGenerator " + this.getClass() + " : SIMPLENODE");
    String code = "";
    if (this.children != null)
      for(int i = 0; i < this.children.length; i++) {
        code += ((SimpleNode)this.children[i]).generateCode(className);
      }

    return code;
  }

  public static String getTypeJasmin(String type){

      switch (type) {
        case "void":
          return "V";
        case "boolean":
          return "Z";
        case "int":
          return "I";
        case "int[]":
          return "[I";
        /*case "String":
          return "Ljava/lang/String;";
        case "String[]":
          return "[Ljava/lang/String;";*/
        default:
          return "Ljava/lang/" + type + ";";
      }
  
      // return "ERROR";
  }
}

/* JavaCC - OriginalChecksum=d33fdb2b8063d5de3474649324d5d160 (do not edit this line) */