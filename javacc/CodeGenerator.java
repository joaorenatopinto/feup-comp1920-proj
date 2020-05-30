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
        code = optimizeIncrements(code);
        code = optimizeLess(code);
        try {
            FileWriter myWriter = new FileWriter(filename + ".j");
            myWriter.write(code);
            myWriter.close();
            System.out.println("Created " + filename + ".j");
          } catch (IOException e) {
            e.printStackTrace();
          }
    }

    String optimizeIncrements(String code){
      String optCode = "";
      String[] lines = code.split("\n");
      
      for (int i = 0; i < lines.length; i++){
        if (i < lines.length - 3 &&
            lines[i].contains("iload") &&
            (lines[i+1].contains("iconst") || lines[i+1].contains("bipush") || lines[i+1].contains("sipush")) &&
            (lines[i+2].equals("iadd") || lines[i+2].equals("isub")) && 
            lines[i+3].contains("istore") &&
            lines[i].split(" ")[1].equals(lines[i+3].split(" ")[1])) {
              String[] s = lines[i+1].split(" ");
              if (s.length == 1){
                s = lines[i+1].split("_");
              } 
              optCode += "iinc " + lines[i].split(" ")[1] + " " +(lines[i+2].equals("isub")? "-":"") + s[1] + "\n";
            i+= 3;
        } else {
          optCode += lines[i] + "\n";
        }
      }
      return optCode;
    }

    String optimizeLess(String code){
      String optCode = "";
      String[] lines = code.split("\n");
      
      for (int i = 0; i < lines.length; i++){
        if (i < lines.length - 1 &&
            lines[i].equals("iconst_0") &&
            lines[i+1].contains("if_icmplt")) {
            String[] s = lines[i+1].split(" ");
            optCode += "iflt " + s[1] + "\n";
            i+= 1;
        } else {
          optCode += lines[i] + "\n";
        }
      }
      return optCode;
    }
}