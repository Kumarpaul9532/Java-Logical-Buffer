/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Unique number or not.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unique {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, x, d, c, y, z = 0;

        System.out.println("\nProgram for checking Unique Number");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(in.readLine());

        c = n;
        while (c != 0) {
            y = c % 10;
            x = n;
            z = 0;
            while (x != 0) {
                d = x % 10;
                if (y == d) {
                    z++;
                    if (z > 1) {
                        System.out.println(n + " is not a Unique number ");
                        System.exit(0);
                    }
                }
                x /= 10;
            }
            c /= 10;
        }
        System.out.println(n + " is a Unique number");

    }
}
