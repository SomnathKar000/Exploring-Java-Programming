public class Test {
    public static void main(String args[]) {
        A obj = new A();
        obj.print();
        A.B obj2 = obj.getB();
        obj2.print();
        A.B.C obj3 = obj2.getC();
        obj3.print();
        obj.printC();
    }
}

class A {
    int num = 12;

    public void print() {
        System.out.println("Print A");
    }

    public B getB() {
        return new B();
    }

    class B {
        public void print() {
            System.out.println("Print B");
        }

        class C {
            public void print() {
                System.out.println("Print C");
            }
        }

        public C getC() {
            return new C();
        }
    }

    public void printC() {
        new B().getC().print();
    }

}