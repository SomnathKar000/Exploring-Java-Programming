public class Test {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        try {
            i = 18 / j;
        } catch (Exception err) {
            System.out.println("Error occurred " + err.getLocalizedMessage());
        }
    }
}
