public class Test {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        try {
            i = 18 / 2;
            throw new MyException("This one is created by me");
        } catch (MyException err) {
            System.out.println(err.toString());
        } catch (Exception err) {
            System.out.println("Error occurred " + err.getLocalizedMessage());
        }
    }
}

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}