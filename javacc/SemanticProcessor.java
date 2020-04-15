import java.util.*;
import java.io.*;

public class SemanticProcessor {
    public static HashMap<String, Integer> symbol_table = new HashMap<String, Integer>();
    public static HashMap<String, String> types_table = new HashMap<String, String>();

    public SemanticProcessor(SimpleNode root) {
        root.process();
    }

    //Not anymore arabian shit bellow - by Afonso Mendonça
    public int proccessNode(ASTAdd node) {
        System.out.println("ADD;");
        SimpleNode left = (SimpleNode) node.children[0];
        SimpleNode right = (SimpleNode) node.children[1];

        return processNode(left) + processNode(right);
    }

    public int processNode(ASTMul node) {
        System.out.println("MUL;");
        SimpleNode left = (SimpleNode) node.children[0];
        SimpleNode right = (SimpleNode) node.children[1];

        return processNode(left) * processNode(right); 
    }

    public int processNode(ASTSub node) {
        System.out.println("SUB;");
        SimpleNode left = (SimpleNode) node.children[0];
        SimpleNode right = (SimpleNode) node.children[1];

        return processNode(left) - processNode(right); 
    }
    
    public int processNode(ASTDiv node) {
        System.out.println("DIV;");
        SimpleNode left = (SimpleNode) node.children[0];
        SimpleNode right = (SimpleNode) node.children[1];

        return processNode(left) / processNode(right); 
    }

    public int processNode(ASTVarDeclaration node) {
        System.out.println("VARDECLARAION Afonsinho.txt;");
        types_table.put(node.ast_id, node.ast_type);
        System.out.println(types_table.toString());
        return 1;
    }   

    public int processNode(SimpleNode node) {
        return 1;
    }

}