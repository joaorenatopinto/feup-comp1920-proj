import java.util.*;

public class SymbolMethod extends Symbol{
    String id;
    String ret_type;
    List<Symbol> arguments;     
    List<Symbol> inscope_symbols;

    public SymbolMethod(String id, String return_type, List<Symbol> args){
        super(id, "method");
        this.ret_type = return_type;
        this.arguments = args;
    }
 
    @Override
    public String toString() {
        String aux = ret_type;
        aux += " " + id;
        for (Symbol arg : arguments) {
            aux += arg.toString();
            aux += ", ";
        }
        return aux;
    }

}