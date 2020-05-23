/* Generated By:JJTree: Do not edit this line. ASTLength.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTLength extends SimpleNode {
  public ASTLength(int id) {
    super(id);
  }

  public ASTLength(Compiler p, int id) {
    super(p, id);
  }

 
  @Override
  public int process(String className) {
    System.out.println(this.getClass());
    
    SimpleNode bro = (SimpleNode)(((SimpleNode)this.jjtGetParent()).children[0]);



    if(bro instanceof ASTIdentifier) {
      Symbol symb = getSymbolFromTable(((ASTIdentifier)bro).ast_value);
      if(!symb.type.equals(Symbol.INT_ARRAY)){
        throw new RuntimeException(((ASTIdentifier)bro).ast_value + " is not a array (length check)" + "\nLine: " + this.line + "; Col: " + this.column);
      } else if (!(((SymbolVar)symb).isInitialized))
          throw new RuntimeException(((ASTIdentifier)bro).ast_value + " is not initialized" + "\nLine: " + this.line + "; Col: " + this.column);
    } else if (bro instanceof ASTAcessMethod){
      ASTAcessMethod broo = ((ASTAcessMethod) bro);
      if(!broo.returnType.equals(Symbol.INT_ARRAY)){
        throw new RuntimeException(broo.ast_method + " doesn't return a array (length check) returns " + broo.returnType + "\nLine: " + this.line + "; Col: " + this.column);
      }
    } else throw new RuntimeException("Doesn't have property length" + "\nLine: " + this.line + "; Col: " + this.column);


    return 1;
  }

  public String getType(){
    return Symbol.INT;
  }

  public String generateCode(String className){
    String code = "";

    SimpleNode father = (SimpleNode)this.jjtGetParent();

    for(int i = 1; i < father.children.length; i++){
      if (father.children[i].equals(this)){
        ((SimpleNode)father.children[i - 1]).generateCode(className);
        break;
      }
    }
    code += "arraylength\n";

    return code;
  }

}
/* JavaCC - OriginalChecksum=355dc3240ae72e2bab32488505528258 (do not edit this line) */
