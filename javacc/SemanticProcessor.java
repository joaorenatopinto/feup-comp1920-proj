import java.util.*;
import java.io.*;

public class SemanticProcessor {
    public static HashMap<String, String> types_table = new HashMap<String, String>();
    public static HashMap<String, Integer> values_table = new HashMap<String, Integer>();

    public SemanticProcessor(SimpleNode root) {
        root.process();
        System.out.println(types_table.toString());
        System.out.println(values_table.toString());
    }
}