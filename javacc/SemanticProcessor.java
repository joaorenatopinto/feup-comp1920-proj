import java.util.*;
import java.io.*;

public class SemanticProcessor {
    public static HashMap<String, Symbol> symbols_table = new HashMap<String, Symbol>();
    public static HashMap<String, SymbolArray> arrays_table = new HashMap<String,SymbolArray>();

    public SemanticProcessor(SimpleNode root) {
        root.process();
        System.out.println(symbols_table);
        System.out.println(arrays_table);
    }
}