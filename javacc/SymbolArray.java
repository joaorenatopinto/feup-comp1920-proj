import java.util.*;

class SymbolArray extends Symbol {
    int size;
    int[] elements;

    public SymbolArray(String id){
        super(id, "int[]");
    }
    
    @Override
    public void initialize(int size) {
        this.size = size;
        this.elements = new int[size];
        this.init = true;
        return;
    }

    public void assignValueToIndex(int index, int value) {
        if (index >= size || index < 0)
            throw new RuntimeException("Index out of bounds (" + index + ") for length " + size);
        elements[index] = value;
    }   

    public int getValueFromIndex(int index){
        if (index >= size || index < 0)
            throw new RuntimeException("Index out of bounds (" + index + ") for length " + size);
        return elements[index];
    }
    
    @Override
    public String toString() {
        return "piroca";
    }
}