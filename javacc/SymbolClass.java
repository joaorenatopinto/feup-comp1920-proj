public class SymbolClass extends Symbol {
    SymbolClass ext;

    SymbolClass(String identifier, String type, SymbolClass ext){
        super(identifier, type);
        this.ext = ext;
    }
}
