public class Test {
    public static void main(String args[]) {
        A obj = new A() {
            public void show() {
                System.out.println("In new Show");
            }
        };

        obj.show();
    }
}

abstract class A {
    public abstract void show();
}