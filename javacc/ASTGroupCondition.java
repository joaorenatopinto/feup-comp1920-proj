/* Generated By:JJTree: Do not edit this line. ASTGroupCondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTGroupCondition extends SimpleNode {
  String type;
  
  public ASTGroupCondition(int id) {
    super(id);
  }

  public ASTGroupCondition(Compiler p, int id) {
    super(p, id);
  }

  @Override
  public int process(String className) {
    SimpleNode leftChild = (SimpleNode)this.children[0];
    SimpleNode rightChild = (SimpleNode)this.children[1];

    if(!(rightChild instanceof ASTGroupCondition)) {
      if(leftChild instanceof ASTAcessMethod) {
        ((ASTAcessMethod)rightChild).ast_identifier = ((ASTAcessMethod)leftChild).getType();
      }
      rightChild.process(className);
      type = rightChild.getType();
    }
    else {
      SimpleNode rightGrandChild = (SimpleNode)rightChild.children[0];
      ASTGroupCondition parent = new ASTGroupCondition(1231);
      // have to do this in order for the tables to work
      parent.jjtSetParent((Node)this);  // parent<-this

      Node oldLeftParent = leftChild.jjtGetParent(); // oldLeftParent == this ?
      leftChild.jjtSetParent((Node)parent);
      parent.jjtAddChild((Node)leftChild, 0); // leftchild<-parent<-this
 
      Node oldRightGrandParent = rightGrandChild.jjtGetParent(); // rightChild == oldRightGrandParent ?
      rightGrandChild.jjtSetParent((Node)parent);  // leftchild|rightGrandChild<-parent<-this
      
      if(rightGrandChild instanceof ASTAcessMethod) {
        if(leftChild instanceof ASTAcessMethod) {
          ((ASTAcessMethod)rightGrandChild).ast_identifier = ((ASTAcessMethod)leftChild).getType();
        }
      }
      parent.jjtAddChild((Node)rightGrandChild, 1);

      rightGrandChild.process(className);

      leftChild.jjtSetParent(oldLeftParent);
      rightGrandChild.jjtSetParent(oldRightGrandParent);

      rightChild.process(className); 

      // Nao percebo porque fazemos alteracoes dos nos para por igual no fim
      type = ((ASTGroupCondition)rightChild).getType();
    }

    return 1;
  }

  public String getType() {
    return type;
  }

  public String generateCode(String className){ // TODO
    // System.out.println("CodeGenerator " + this.getClass() + " : SIMPLENODE");
    String code = "";
    if (this.children != null)
      for(int i = 1; i < this.children.length; i++) {
        code += ((SimpleNode)this.children[i]).generateCode(className);
      }

    return code;
  }

}
/* JavaCC - OriginalChecksum=222f506a4c1c7a3b91484b46866c563e (do not edit this line) */
