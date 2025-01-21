public class Test {
    public static void main(String args[]) {
        Status s = Status.Error;
        int i = s.ordinal();
        System.out.println(s + " " + i);

    }
}

enum Status {
    Success, Pending, Error, Running
}