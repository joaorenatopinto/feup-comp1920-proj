import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Write an arithmetic expression:");
        System.setIn(new FileInputStream(new File(args[0])));
		Compiler myComp = new Compiler(System.in);
		
		try {
        SimpleNode root = myComp.Program(); // returns reference to root node
        
        	
		root.dump(""); // prints the tree on the screen
        SemanticProcessor processor = new SemanticProcessor(root);
        CodeGenerator codeGenerator = new CodeGenerator(root);
		// System.out.println("Expression value: "+Main.eval(root));
		
		}catch(Exception e) {
            System.out.println("Catch merdoso");
            e.printStackTrace();
		}
	}

    public static int eval(SimpleNode node) {

        // if (node.jjtGetNumChildren() == 0) // leaf node with integer value
        //     return node.val;
        // else if (node.jjtGetNumChildren() == 1) // only one child
        //     return eval((SimpleNode) node.jjtGetChild(0));

        // SimpleNode lhs = (SimpleNode) node.jjtGetChild(0); // left child
        // SimpleNode rhs = (SimpleNode) node.jjtGetChild(1); // right child

        // switch (node.id) {
        // case CalculatorTreeConstants.JJTADD:
        //     return eval(lhs) + eval(rhs);
        // case CalculatorTreeConstants.JJTSUB:
        //     return eval(lhs) - eval(rhs);
        // case CalculatorTreeConstants.JJTMUL:
        //     return eval(lhs) * eval(rhs);
        // case CalculatorTreeConstants.JJTDIV:
        //     return eval(lhs) / eval(rhs);
        // default: // abort
        //     throw new RuntimeException("Ilegal operator!");
        // }

        return 0;

    }
	
}