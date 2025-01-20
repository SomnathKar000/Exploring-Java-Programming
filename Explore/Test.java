public class Test {
    public static void main(String args[]) {
        A obj = new Printer();
        obj.Print();
        obj.Show();
    }
}

interface A {
    void Show();

    void Print();
}

class Printer implements A {
    public void Show() {
        System.out.println("This is show");
    }

    public void Print() {
        System.out.println("This is Print");
    }
}