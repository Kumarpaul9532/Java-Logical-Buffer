/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Fibo-Prime or not.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiboPrime {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, a = -1, b = 1, c = 0, d = 0, i = 2;

        System.out.println("\nProgram for checking Fibo-Prime");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(in.readLine());

        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a Fibo-Prime number");
                d = 1;
                break;
            }
        }
        if (d == 0) {
            while (a + b <= n) {
                c = a + b;
                if (c == n) {
                    d = 1;
                    System.out.println(n + " is a Fibo-Prime number");
                    break;
                }
                a = b;
                b = c;
            }
            if (d == 0)
                System.out.println(n + " is not a Fibo-Prime number");
        }

    }
}
