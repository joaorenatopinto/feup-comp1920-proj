import java.util.*;
import java.io.*;

public class SemanticProcessor {
    public static HashMap<String, Symbol> symbols_table = new HashMap<String, Symbol>();

    public SemanticProcessor(SimpleNode root) {
        root.process();
        System.out.println(symbols_table.toString());
    }
}