public class Test {
    public static void main(String args[]) {
        int num = 4;
        Integer num1 = num; // auto boxing

        int num2 = num1.intValue(); // unboxing

        System.out.println(num2);

    }
}