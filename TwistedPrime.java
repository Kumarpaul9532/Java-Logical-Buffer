/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Twisted Prime  or not.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwistedPrime {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, x, s = 0, d, c = 0, i = 2;

        System.out.println("\nProgram for checking Twisted Prime");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());

        if (n == 2 || n == 3 || n == 7 || n == 5)
            System.out.println(n + " is a Twisted Prime");
        else if (n == 1 || n % 2 == 0 || n % 3 == 0)
            System.out.println(n + " is not a Twisted Prime");
        else {
            for (; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.printf("%d itself is not a Prime number", n);
                    c = 1;
                    break;
                }
            }
            if (c == 0) {
                x = n;
                while (x != 0) {
                    d = x % 10;
                    s = s * 10 + d;
                    x /= 10;
                }

                for (i = 2; i <= Math.sqrt(s); i++) {
                    if (s % i == 0) {
                        System.out.printf("%d is not a Twisted Prime number", n);
                        c = 1;
                        break;
                    }
                }

                if (c == 0)
                    System.out.println(n + " is a Twisted Prime");
            }
        }
    }
}
