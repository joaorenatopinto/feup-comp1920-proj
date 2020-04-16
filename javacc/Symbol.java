class Symbol {
    String id;
    String type; // int ; boolean ; int[] -> Array.java
    boolean init;
    int value;

    public Symbol(String id, String type) {
        this.id = id;
        this.type = type;
        this.init = false;
    }

    public void initialize(int value) {
        this.init = true;
        this.value = value;
    }

    public String toString() {
        return Integer.toString(value);
    }
}