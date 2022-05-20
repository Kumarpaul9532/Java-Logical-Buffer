/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and count the frequency of each digit.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frequency {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i = 0, c, d, x;

        System.out.println("\nProgram to count frequency of digits");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());

        for (; i <= 9; i++) {
            x = n;
            c = 0;
            while (x != 0) {
                d = x % 10;
                if (d == i)
                    c++;
                x /= 10;
            }
            if (c != 0)
                System.out.printf("The frequency of %d in %d is %d\n", i, n, c);
        }

    }
}
