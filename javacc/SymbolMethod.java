import java.util.*;

public class SymbolMethod extends Symbol{
    
    List<Symbol> arguments;

    public SymbolMethod(String identifier, String return_type, List<Symbol> arguments){
        super(identifier, return_type, false);
        this.arguments = arguments;
    }
 
    // @Override
    // public String toString() {
    //     String aux = ret_type;
    //     aux += " " + id;
    //     for (Symbol arg : arguments) {
    //         aux += arg.toString();
    //         aux += ", ";
    //     }
    //     return aux;
    // }

}