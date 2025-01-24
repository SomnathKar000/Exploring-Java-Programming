import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) throws IOException {
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter a number ");

            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}
