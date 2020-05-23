import TestClass.otario(int, int) int;
//import TestClass;
class T {
    public static void main(String[] args) { 
        int a;
        int b;
        T t;
        a = 0;
        b = 0;
        while (a < 2){
            a = a + 1;
            b = b + 1;
        }
        t = new T();
        a = t.test(3);
    }
    public int test(int i) {
        return i;
    }
}