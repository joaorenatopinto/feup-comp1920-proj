import java.util.*;
import java.io.*;

public class SemanticProcessor {
    // public static HashMap<String, Symbol> symbols_table = new HashMap<String, Symbol>();
    // public static HashMap<String, SymbolArray> arrays_table = new HashMap<String,SymbolArray>();

    // public static HashMap<String, SymbolMethod> methods_table = new HashMap<String,SymbolMethod>();

    // public static HashMap<String, Symbol> methods_symbols_table = new HashMap<String, Symbol>();
    // public static HashMap<String, SymbolArray> methods_arrays_table = new HashMap<String, SymbolArray>();

    // public static HashMap<String, Symbol> symbols_table = new HashMap<String, Symbol>();

    // public static boolean insideMethod = false;

    public SemanticProcessor(SimpleNode root) {
        // initialProcessing(root);
        root.process();
        // System.out.println(symbols_table);
        // System.out.println(arrays_table);
        // System.out.println(methods_table);
    }

    // public void initialProcessing(SimpleNode root) {
    //     ASTClassDeclaration class_root = (ASTClassDeclaration)((SimpleNode)((SimpleNode)root.children[0]).children[0]).children[1];
    //     for(int i = 0; i < class_root.children.length; i++) {
    //         SimpleNode curr_node = ((SimpleNode)(((SimpleNode)class_root).children[i]));
    //         ASTMain main;
    //         ASTMethod method;
    //         if(curr_node.getNodeType().equals("class ASTMain")) {
    //             main = (ASTMain)curr_node;
    //             // processo?? nao se vai puder chamar o main supostamente ne ahah
    //         }
    //         else if(curr_node.getNodeType().equals("class ASTMethod")) {
    //             System.out.println("CLASS ASTMETHOD");

    //             method = (ASTMethod)curr_node;

    //             List<Symbol> method_args = new ArrayList<>();
    //             String ast_id = method.ast_id;
    //             String ast_type = method.ast_type;

    //             for (int j = 0; j < ((SimpleNode)method.children[0]).children.length; j++) {
    //                 ASTArg arg = (ASTArg)((SimpleNode)(method.children[0])).children[j];
    //                 String type = arg.ast_type;
    //                 String identifier = arg.ast_id;
    //                 if(type.equals("int[]")) {
    //                   SymbolArray curSymbol = new SymbolArray(identifier);
    //                   //curSymbol.initialize(0);
    //                   //SemanticProcessor.methods_arrays_table.put(identifier, curSymbol);
    //                   method_args.add(curSymbol);
    //                 } else {
    //                   Symbol curSymbol = new Symbol(identifier, type);
    //                   //curSymbol.initialize(0);
    //                   //SemanticProcessor.methods_symbols_table.put(identifier, curSymbol);
    //                   method_args.add(curSymbol);
    //                 }    
    //               }
                  
    //               SemanticProcessor.methods_table.put(ast_id, new SymbolMethod(ast_id, ast_type, method_args));
    //         }
    //         else continue;
    //     }
    // }
}