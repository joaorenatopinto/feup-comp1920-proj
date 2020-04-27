abstract class Symbol {

    static String INT = "int";
    static String INT_ARRAY = "int[]";
    static String BOOLEAN = "boolean";
    static String CLASS = "class";
    static String METHOD = "method";
    
    String identifier;
    String type; 

    public Symbol(String identifier, String type) {
        this.identifier = identifier;
        this.type = type;
    }

}