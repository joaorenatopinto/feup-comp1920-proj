
public class SymbolVar extends Symbol {

    boolean isInitialized = false;

    SymbolVar(String identifier, String type){
        super(identifier, type, true);
    }

    public void initialize(){
        this.isInitialized = true;
    }
}