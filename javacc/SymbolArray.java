import java.util.*;

class SymbolArray extends Symbol {
    int size;
    List<Integer> elements; 

    public SymbolArray(String id){
        super(id, "int[]");
    }
    
    @Override
    public void initialize(int size) {
        this.elements = new ArrayList<Integer>();
        this.size = size;
        this.init = true;
        return;
    }
}