public class Test {
    public static void main(String args[]) {
        try {
            Demo obj = new Demo();
            obj.showClass("jhsdgfhgd");
            System.out.println("Found the class");

        } catch (Exception e) {
            System.out.println("Something went wrong " + e.toString());
        }
    }
}

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

class Demo {
    public void showClass(String name) throws Exception {
        Class.forName(name);
    }
}