public class Test {
    public static void main(String args[]) {
        A obj = new A();
        obj.print();
        A.B obj2 = obj.new B();
        obj2.print();
        A.B.C obj3 = new A.B.C();
        obj3.print();

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

        static class C {
            public void print() {
                System.out.println("Print C");
            }
        }

    }

}