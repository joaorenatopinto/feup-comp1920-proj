import java.util.*;
import java.io.*;

public class SemanticProcessor {
    public static HashMap<String, Symbol> symbols_table = new HashMap<String, Symbol>();
    public static HashMap<String, SymbolArray> arrays_table = new HashMap<String,SymbolArray>();

    public static HashMap<String, SymbolMethod> methods_table = new HashMap<String,SymbolMethod>();

    public static HashMap<String, Symbol> methods_symbols_table = new HashMap<String, Symbol>();
    public static HashMap<String, SymbolArray> methods_arrays_table = new HashMap<String, SymbolArray>();

    public static boolean insideMethod = false;

    public SemanticProcessor(SimpleNode root) {
        root.process();
        System.out.println(symbols_table);
        System.out.println(arrays_table);
        System.out.println(methods_table);
        System.out.println("Methods:");
        System.out.println(methods_symbols_table);
        System.out.println(methods_arrays_table);

    }
}