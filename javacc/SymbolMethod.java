import java.util.*;

public class SymbolMethod extends Symbol{
    
    List<Symbol> arguments;
    String className;
    boolean isStatic;

    public SymbolMethod(String identifier, String return_type, String className, List<Symbol> arguments){
        super(identifier, return_type);
        this.arguments = arguments;
        this.className = className;
        this.isStatic = false;
    }

    public SymbolMethod(String identifier, String return_type, String className, List<Symbol> arguments, boolean isStatic){
        super(identifier, return_type);
        this.arguments = arguments;
        this.className = className;
        this.isStatic = isStatic;
    }
}