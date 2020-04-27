import java.util.*;

public class SymbolMethod extends Symbol{
    
    List<Symbol> arguments;
    String className;

    public SymbolMethod(String identifier, String return_type, String className, List<Symbol> arguments){
        super(identifier, return_type);
        this.arguments = arguments;
        this.className = className;
    }
}