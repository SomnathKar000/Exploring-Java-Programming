public class Test {
    public static void main(String args[]) {
        A obj = new B() {
            public void show() {
                System.out.println("In New Show");
            }
        };
        obj.show();

    }
}

class A {
    public void show() {
        System.out.println("In A Show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}