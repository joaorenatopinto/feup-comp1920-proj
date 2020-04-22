abstract class Symbol {

    static String INT = "int";
    static String INT_ARRAY = "int[]";
    static String BOOLEAN = "boolean";
    static String CLASS = "class";
    static String METHOD = "method";
    
    String identifier;
    String type; 
    boolean isVar;  // can be var or method

    public Symbol(String identifier, String type, boolean isVar) {
        this.identifier = identifier;
        this.type = type;
        this.isVar = isVar;
    }

}