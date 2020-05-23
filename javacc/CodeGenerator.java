import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {

    static int loopNumber = 0;

    static int maxStack = 0;
    static int totalStack = 0;

    static public void incStack() {
      totalStack++;
      if(totalStack > maxStack) {
        maxStack = totalStack;
      }
      System.out.println("Stack: " + totalStack);
    }

    static public void decStack(int value) {
      totalStack -= value;
      System.out.println("Stack: " + totalStack);
    }

    static public void resetStack() {
      maxStack = 0;
      totalStack = 0;
    }

    static public void incStack(SimpleNode node) {
      totalStack++;
      if(totalStack > maxStack) {
        maxStack = totalStack;
      }
      System.out.println("Stack: " + totalStack + " ; Row,Col: " + node.line +","+node.column + "(" + node.getClass() + ")");
    }

    static public void decStack(int value, SimpleNode node) {
      totalStack -= value;
      System.out.println("Stack: " + totalStack + " ; Row,Col: " + node.line +","+node.column + "(" + node.getClass() + ")");
    }

    static public void resetStack(SimpleNode node) {
      maxStack = 0;
      totalStack = 0;
      System.out.println("Reset stack " + " ; Row,Col: " + node.line +","+node.column + "(" + node.getClass() + ")");
    }

    public CodeGenerator(SimpleNode root, String filename) {
        String code = root.generateCode(null);
        try {
            FileWriter myWriter = new FileWriter(filename + ".j");
            myWriter.write(code);
            myWriter.close();
            System.out.println("Created " + filename + ".j");
          } catch (IOException e) {
            e.printStackTrace();
          }
    }
}