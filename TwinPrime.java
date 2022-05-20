/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept two numbers as input from the user
                and check whether the numbers are Twin prime or not.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwinPrime {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, m, i = 2, d = 0;

        System.out.println("\nProgram for checking Twin Prime");
        System.out.print("Enter two numbers : ");
        n = Integer.parseInt(in.readLine());
        m = Integer.parseInt(in.readLine());

        if (n % 2 == 0 || m % 2 == 0)
            System.out.printf("%d and %d are not Twin Prime", n, m);
        else if (Math.abs(n - m) != 2)
            System.out.printf("%d and %d are not Twin Prime", n, m);
        else {
            for (; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    System.out.printf("%d and %d are not Twin Prime", n, m);
                    d = 1;
                    break;

                }
            }
            if (d == 0) {
                for (i = 2; i <= Math.sqrt(m); i++) {
                    if (m % i == 0) {
                        System.out.printf("%d and %d are not Twin Prime", n, m);
                        d = 1;
                        break;

                    }
                }
                if (d == 0)
                    System.out.printf("%d and %d are Twin Prime", n, m);
            }
        }
    }
}
