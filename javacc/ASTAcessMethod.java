/* Generated By:JJTree: Do not edit this line. ASTAcessMethod.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
import java.util.*;

public
class ASTAcessMethod extends SimpleNode {
  String ast_identifier;
  String ast_method;

  String returnType = null;

  public ASTAcessMethod(int id) {
    super(id);
  }

  public ASTAcessMethod(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process(String className) {
    // ver o irmao da esquerda se é ASTObject ou ASTIdentifier
    SimpleNode bro = (SimpleNode)(((SimpleNode)this.jjtGetParent()).children[0]);

    List<String> argsType = new ArrayList<>();
     
    if(this.children != null && ((SimpleNode)this.children[0]).children != null) {
      for (int j = 0; j < ((SimpleNode)this.children[0]).children.length; j++) {
        argsType.add(((SimpleNode)((SimpleNode)(this.children[0])).children[j]).getType());
      }
    }

    String id_method_table = SimpleNode.createId(className, ast_method, argsType);

    if(bro instanceof ASTObject) {

      bro.process(className);

      System.out.println("ASTOBJECT " + ast_identifier + " : " + ast_method);

      // Symbol symbol = getSymbolFromTable(ast_identifier);

      Symbol method = getSymbolFromTable(id_method_table);

      if (method == null){
        
        Symbol parentClass = getSymbolFromTable(className);

        if (parentClass == null)
          throw new RuntimeException(ast_method + " not declared.");

        if (!(parentClass instanceof SymbolClass)){
          throw new RuntimeException(ast_method + " not declared.");
        }

        if (((SymbolClass)parentClass).ext == null)
          throw new RuntimeException(ast_method + " not declared.");
          
          
        id_method_table = SimpleNode.createId(((SymbolClass)parentClass).ext.identifier, ast_method, argsType);

        method = getSymbolFromTable(id_method_table);

        if (method == null)
          throw new RuntimeException(ast_method + " not declared.");

        SymbolMethod symbolMethod = (SymbolMethod)method;

        if (!((SymbolClass)parentClass).ext.identifier.equals(symbolMethod.className)) {
          throw new RuntimeException("Object " + ast_identifier + "(" + ast_identifier + ")" + " doesn't have " + ast_method + " method.");
        }

        returnType = symbolMethod.type;

      } else {

        if (!(method instanceof SymbolMethod)){
          throw new RuntimeException(ast_method + " not declared.");
        }

        SymbolMethod thisSymbolMethod = (SymbolMethod)method;

        if(!ast_identifier.equals(thisSymbolMethod.className)) {
          throw new RuntimeException(ast_method + " method doesn't return a " + thisSymbolMethod.className + " object. Returns " + ast_identifier);
        }

        returnType = thisSymbolMethod.type;
      }


      SymbolMethod symbolMethod = (SymbolMethod) method;

      if (!ast_identifier.equals(symbolMethod.className)) {
        throw new RuntimeException("Object " + ast_identifier + " doesn't have " + ast_method + " method.");
      }

      returnType = ast_identifier;

     
    


    }
    else if(bro instanceof ASTIdentifier) {

      bro.process(className);
      
      System.out.println("ASTIDENTIFIER " + ast_identifier + " : " + ast_method);
      Symbol symbol = getSymbolFromTable(ast_identifier);

      if (symbol == null) {
        throw new RuntimeException("Variable not declared: " + ((ASTIdentifier)bro).ast_value);
      }

      Symbol method = getSymbolFromTable(id_method_table);

      if (method == null){
        
        Symbol parentClass = getSymbolFromTable(className);

        if (parentClass == null)
          throw new RuntimeException(ast_method + " not declared.");

        if (!(parentClass instanceof SymbolClass)){
          throw new RuntimeException(ast_method + " not declared.");
        }

        if (((SymbolClass)parentClass).ext == null)
          throw new RuntimeException(ast_method + " not declared.");
          
          
        id_method_table = SimpleNode.createId(((SymbolClass)parentClass).ext.identifier, ast_method, argsType);

        method = getSymbolFromTable(id_method_table);

        if (method == null)
          throw new RuntimeException(ast_method + " not declared.");

        SymbolMethod symbolMethod = (SymbolMethod)method;

        if (!((SymbolClass)parentClass).ext.identifier.equals(symbolMethod.className)) {
          throw new RuntimeException("Object " + ast_identifier + "(" + symbol.type + ")" + " doesn't have " + ast_method + " method.");
        }

        returnType = symbolMethod.type;

      } else {

        if (!(method instanceof SymbolMethod)){
          throw new RuntimeException(ast_method + " not declared.");
        }

        SymbolMethod thisSymbolMethod = (SymbolMethod)method;

        if(!symbol.type.equals(thisSymbolMethod.className)) {
          throw new RuntimeException(ast_method + " method doesn't return a " + thisSymbolMethod.className + " object. Returns " + ast_identifier);
        }

        returnType = thisSymbolMethod.type;
      }

      SymbolMethod symbolMethod = (SymbolMethod) method;

      // if (!symbol.type.equals(symbolMethod.className)) {
      //   throw new RuntimeException("Object " + ast_identifier + " doesn't have " + ast_method + " method.");
      // }

      returnType = symbolMethod.type;

      SymbolVar var = (SymbolVar) symbol;

      if (!var.isInitialized) {
        throw new RuntimeException("Variable not initialized.");
      }

    } 
    else if(bro instanceof ASTAcessMethod) {

      System.out.println("ASTACESSMETHOD " + ast_identifier + " : " + ast_method);
      returnType = "int";
      
      // Symbol leftMethod = getSymbolFromTable(ast_identifier);
      Symbol method = getSymbolFromTable(id_method_table);

      if (method == null){
        
        Symbol parentClass = getSymbolFromTable(className);

        if (parentClass == null)
          throw new RuntimeException(ast_method + " not declared.");

        if (!(parentClass instanceof SymbolClass)){
          throw new RuntimeException(ast_method + " not declared.");
        }

        if (((SymbolClass)parentClass).ext == null)
          throw new RuntimeException(ast_method + " not declared.");
          
          
        id_method_table = SimpleNode.createId(((SymbolClass)parentClass).ext.identifier, ast_method, argsType);

        method = getSymbolFromTable(id_method_table);

        if (method == null)
          throw new RuntimeException(ast_method + " not declared.");

        SymbolMethod thisSymbolMethod = (SymbolMethod)method;

        if(!((SymbolClass)parentClass).ext.identifier.equals(thisSymbolMethod.className))
          throw new RuntimeException(ast_method + " method doesn't return a " + thisSymbolMethod.className + " object. Returns " + ((SymbolClass)parentClass).ext.identifier);

        returnType = thisSymbolMethod.type;

      } else {

        if (!(method instanceof SymbolMethod)){
          throw new RuntimeException(ast_method + " not declared.");
        }

        SymbolMethod thisSymbolMethod = (SymbolMethod)method;

        if(!ast_identifier.equals(thisSymbolMethod.className)) {
          throw new RuntimeException(ast_method + " method doesn't return a " + thisSymbolMethod.className + " object. Returns " + ast_identifier);
        }

        returnType = thisSymbolMethod.type;
      }
      
      

      // if(!ast_identifier.equals(thisSymbolMethod.className)) {
      //   if(!((SymbolClass)parentClass).ext.identifier.equals(thisSymbolMethod.className))
      //   throw new RuntimeException(ast_method + " method doesn't return a " + thisSymbolMethod.className + " object. Returns " + ast_identifier);
      // }   

      

      // if (thisSymbolMethod.arguments.size() != argsType.size()){
      //   throw new RuntimeException("Method args do not match in size(" + thisSymbolMethod.arguments.size() + ", " + argsType.size() +")");
      // }

      
      // for (int i = 0; i < thisSymbolMethod.arguments.size(); i++){
      //   if (!thisSymbolMethod.arguments.get(i).type.equals(argsType.get(i)))
      //     throw new RuntimeException("Method args do not match (" + thisSymbolMethod.arguments.get(i).type + ", " + argsType.get(i) +")");
      // }

    } 
    
    else if (bro instanceof ASTThis) {

      bro.process(className);

      System.out.println("ASTOBJECT " + ast_identifier + " : " + ast_method);

      Symbol method = getSymbolFromTable(id_method_table);

      if (method == null){
        
        Symbol parentClass = getSymbolFromTable(className);

        if (parentClass == null)
          throw new RuntimeException(ast_method + " not declared.");

        if (!(parentClass instanceof SymbolClass)){
          throw new RuntimeException(ast_method + " not declared.");
        }

        if (((SymbolClass)parentClass).ext == null)
          throw new RuntimeException(ast_method + " not declared.");
          
          
        id_method_table = SimpleNode.createId(((SymbolClass)parentClass).ext.identifier, ast_method, argsType);

        method = getSymbolFromTable(id_method_table);

        if (method == null)
          throw new RuntimeException(ast_method + " not declared.");

        SymbolMethod symbolMethod = (SymbolMethod)method;

        if (!((SymbolClass)parentClass).ext.identifier.equals(symbolMethod.className)) {
          throw new RuntimeException("Object " + className + "(" + className + ")" + " doesn't have " + ast_method + " method.");
        }

        returnType = symbolMethod.type;

      } else {

        if (!(method instanceof SymbolMethod)){
          throw new RuntimeException(ast_method + " not declared.");
        }

        SymbolMethod thisSymbolMethod = (SymbolMethod)method;

        if(!className.equals(thisSymbolMethod.className)) {
          throw new RuntimeException(ast_method + " method doesn't return a " + thisSymbolMethod.className + " object. Returns " + className);
        }

        returnType = thisSymbolMethod.type;
      }

      SymbolMethod symbolMethod = (SymbolMethod) method;

      if (!className.equals(symbolMethod.className)) {
        throw new RuntimeException("Object " + className + " doesn't have " + ast_method + " method.");
      }

      returnType = className;


      System.out.println("\nARGUMENTOS:" + argsType + "\n");

      if (symbolMethod.arguments.size() != argsType.size()){
        throw new RuntimeException("Method args do not match in size(" + symbolMethod.arguments.size() + ", " + argsType.size() +")");
      }

      
      for (int i = 0; i < symbolMethod.arguments.size(); i++){
        if (!symbolMethod.arguments.get(i).type.equals(argsType.get(i)))
          throw new RuntimeException("Method args do not match (" + symbolMethod.arguments.get(i).type + ", " + argsType.get(i) +")");
      }
      
    } else throw new RuntimeException("opa nao sei que dizer, és um burro");

    return 1;
  }

  public String getType(){
    if (returnType == null)
      return "return type not initialized";
    return returnType;
  }
}
/* JavaCC - OriginalChecksum=5a72632e1aaebf06ca4ffdc6eef531b9 (do not edit this line) */
