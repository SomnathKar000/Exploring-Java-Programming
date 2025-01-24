import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = null;
        try {
            System.out.print("Enter a number ");
            InputStreamReader in = new InputStreamReader(System.in);
            bf = new BufferedReader(in);
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } finally {
            bf.close();
        }
    }
}
