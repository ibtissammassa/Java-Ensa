public class A {
    static int f(int n){
        q=n;
    }
    void g(int n){
        q=n;
        p=n;
    }
    static private final int p = 20;
    private static int q;
}
public class EssaiA{

public static void main(String[] args) {
        A a=new A();
        int n=5;
        a.g(n);
        A.f(n);
        A.f(n);
}
}