public class Test {
    public static void main(String args[]) {
        Printer obj = new Printer();
        obj.Print();
        obj.Show();
        obj.Extra();
        System.out.println(Printer.age);
    }
}

interface A {
    int age = 2; // Final and static
    String type = "Interface"; // Final and static

    void Show();

    void Print();
}

class Printer implements A {
    public static String age = "Test";

    public void Show() {
        System.out.println("This is show");
    }

    public void Print() {
        System.out.println("This is Print");
    }

    public void Extra() {
        System.out.println("This is Extra");
    }
}