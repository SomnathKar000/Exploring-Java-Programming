import java.util.*;

public class UserInput {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input1 =sc.nextInt();
        System.out.print("Enter a number: ");
        int input2 =sc.nextInt();
        int input = input1 + input2;
        sc.close();
        System.out.println("Sum: "+input);
    }
}
