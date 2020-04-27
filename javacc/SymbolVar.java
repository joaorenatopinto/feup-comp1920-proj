
public class SymbolVar extends Symbol {

    boolean isInitialized = false;

    SymbolVar(String identifier, String type){
        super(identifier, type);
    }

    public void initialize(){
        this.isInitialized = true;
    }
}