public class Test {
    public static void main(String args[]) {
        A obj = () -> {
            System.out.println("This is show");
        };

        obj.show();
    }
}

@FunctionalInterface
interface A {
    void show();
}