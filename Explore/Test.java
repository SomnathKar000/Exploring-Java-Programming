public class Test {
    public static void main(String args[]) {
        A obj = new A();
        obj.print();
        A.B obj2 = obj.getB();
        obj2.print();
    }
}

class A {
    int num = 12;

    public void print() {
        System.out.println("Print A");
    }

    class B {
        public void print() {
            System.out.println("Print B");
        }
    }

    public B getB() {
        return new B();
    }
}