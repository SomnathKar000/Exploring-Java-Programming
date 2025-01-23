import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) throws IOException {
        System.out.print("Enter a Number ");
        // int num = System.in.read();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The number is " + num);

        sc.close();

    }
}
