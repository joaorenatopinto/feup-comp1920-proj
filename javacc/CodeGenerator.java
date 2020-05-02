import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {
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