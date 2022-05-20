/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Neon number or not.
   IDE        : VS Code             */

/* Sum of its digit of the sqaure of the number is equal to the number.  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Neon {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, x, s = 0, d;

        System.out.println("\nProgram for checking Neon Number");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());

        x = n * n;
        while (x != 0) {
            d = x % 10;
            s += d;
            x /= 10;
        }
        if (s == n)
            System.out.println(n + " is a Neon Number");
        else
            System.out.println(n + " is not a Neon Number");
    }
}
