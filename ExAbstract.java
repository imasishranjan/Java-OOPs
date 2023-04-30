abstract class TestAbstract {
    int m;
    abstract void g();
    abstract void display();
    void f() {
        System.out.println("Now in test abstract f()");
        m=100;
    }
}
class ClassX extends TestAbstract {
    int n;
    void g() {
        System.out.println("Now in ClassX.g()");
        n = 400;
    }
    void display() {
        System.out.println("m = "+m+"n = "+n);
    }
}
class ClassY extends TestAbstract {
    double n;
    void g() {
        System.out.println("Now in ClassY.g()");
        n = 3.1415;
    }
    void display() {
        System.out.println("m = "+m+"n = "+n);
    }
}
class ExAbstract {
    public static void main (String args[]) {
        ClassX x = new ClassX();
        x.f();
        x.g();
        x.display();
        ClassY y = new ClassY();
        y.f();
        y.g();
        y.display();
    }
}