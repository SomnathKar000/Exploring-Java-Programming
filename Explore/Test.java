public class Test {
    public static void main(String args[]) {
        C obj = new C();
        obj.print();
        obj.show();
    }
}

interface A {
    void show();
}

interface B extends A {
    void print();
}

class C implements B {
    public void show() {
        System.out.println("This is show");
    }

    public void print() {
        System.out.println("This is Print");
    }
}