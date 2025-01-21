public class Test {
    public static void main(String args[]) {
        A obj = new A() {
            public void show() {
                System.out.println("This is show");
            }
        };
        obj.show();
    }
}

@FunctionalInterface
interface A {
    void show();
}