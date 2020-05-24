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

      if (!((SimpleNode)this.children[0]).getType().equals(Symbol.INT)){
        throw new RuntimeException("ASTAssign: Variable index (" + identifier + ") not a int"+ "\nLine: " + this.line + "; Col: " + this.column);
      }

      index++;
    }

    SimpleNode child = (SimpleNode)this.children[index];

    child.process(className);

    Symbol symbolLeft = getSymbolFromTable(identifier);
    System.out.println("ASTASSIGN LEFT TYPE: " + symbolLeft.type);
    if( !(symbolLeft.type.equals(Symbol.INT_ARRAY) ) ) { // not array
      if (!child.getType().equals(symbolLeft.type)) {
        throw new RuntimeException("ASTAssign is not equal (" + symbolLeft.type + ", " + child.getType() + ")"+ "\nLine: " + this.line + "; Col: " + this.column);
      }

      SymbolVar var = (SymbolVar) symbolLeft;
      
      var.initialize();
    }
    else {
      
      SymbolVar var = (SymbolVar) symbolLeft;

      if (this.children.length == 2) { // Assign value to index array
        if (!child.getType().equals(Symbol.INT)){
          throw new RuntimeException("ASTAssign: Assigned type (" + child.getType() + ") not a int"+ "\nLine: " + this.line + "; Col: " + this.column);
        }
      } else {
        if (!child.getType().equals(Symbol.INT_ARRAY)){
          throw new RuntimeException("ASTAssign: Assigned type (" + child.getType() + ") not a int[]"+ "\nLine: " + this.line + "; Col: " + this.column);
        }
        var.initialize();
      }

      // if (child.getType().equals(symbolLeft.type)){
      //   // VERIFICAR SE É NEW INT OU ASSING DE ARRAY JA EXISTENTE PARA VER AS CHILDS
      //     var.initialize();
      //   return 1;
      // }
      // else if( child.getType().equals(Symbol.INT_ARRAY) ) { // se estiver a ser inicializado
      //   var grandChild = (SimpleNode)child.children[0];
      //   grandChild.process(className);
      //   if( grandChild.getType().equals(Symbol.INT) ) {
      //     var.initialize();
      //   }
      //   else {
      //     throw new RuntimeException("ASTAssign: int array size must be integer."+ "\nLine: " + this.line + "; Col: " + this.column);
      //   }
        
      // }
      // else if ( var.isInitialized ) { // se estiver inicializado
      //   if( !child.getType().equals(Symbol.INT) ) { // se nao for int
      //     throw new RuntimeException("ASTAssign: int[] (" + symbolLeft.identifier + ") can only store int types."+ "\nLine: " + this.line + "; Col: " + this.column);
      //   }
      // }
      // else { // se n estiver inicializado
      //   throw new RuntimeException("ASTAssign: int[] (" + symbolLeft.identifier + ") has not been initialized."+ "\nLine: " + this.line + "; Col: " + this.column);
      // }
    }
    
    return 1;
  }

  public String getNodeType() {
    return this.getClass().toString();
  }

  public String generateCode(String className){
    // System.out.println("CodeGenerator " + this.getClass() + " : SIMPLENODE");
    String code = "";

    Symbol symbolLeft = getSymbolFromTable(identifier);

    if(symbolLeft.id_jasmin != -1){ // If not in global scope
      if (symbolLeft.type.equals(Symbol.INT_ARRAY)) {
        if (this.children.length == 2) {
          code += "aload " + symbolLeft.id_jasmin + "\n";
          CodeGenerator.incStack(this);
        }
      }
    } else {
      if (symbolLeft.type.equals(Symbol.INT_ARRAY) && this.children.length == 2){
          code += "aload_0\n";
          CodeGenerator.incStack(this);
          code += "getfield " + className + "/" + identifier + " " + SimpleNode.getTypeJasmin(symbolLeft.type) + "\n";
      } else {
        code += "aload_0\n";
        CodeGenerator.incStack(this);
      }
    }

    if (this.children != null)
      for(int i = 0; i < this.children.length; i++) {
        code += ((SimpleNode)this.children[i]).generateCode(className);
      }

    if(symbolLeft.id_jasmin != -1){ // If not in global scope
      if (symbolLeft.type.equals(Symbol.INT_ARRAY)){
        if (this.children.length == 2) {  // acess array on left
          code += "iastore\n";
          CodeGenerator.decStack(3,this);
        }
        else if (this.children.length == 1) {
          code += "astore " + symbolLeft.id_jasmin + "\n";
          CodeGenerator.decStack(1,this);
        }
      }else if (symbolLeft.type.equals(Symbol.INT)) {
        code += "istore " + symbolLeft.id_jasmin + "\n";
        CodeGenerator.decStack(1,this);
      } else {
        code += "astore " + symbolLeft.id_jasmin + "\n";
        CodeGenerator.decStack(1,this);
      }
    } else {
      if (symbolLeft.type.equals(Symbol.INT_ARRAY) && this.children.length == 2){
        code += "iastore\n";
        CodeGenerator.decStack(3,this);
      } else {
        code +=  "putfield " + className + "/" + identifier + " " + SimpleNode.getTypeJasmin(symbolLeft.type) + "\n";
        CodeGenerator.decStack(2,this);
      }
    }
    return code;
  }

}
/* JavaCC - OriginalChecksum=4793199788c28cc272f0923738dc0777 (do not edit this line) */
