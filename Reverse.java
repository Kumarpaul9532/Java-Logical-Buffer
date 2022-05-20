/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and print the reverse of the number.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, x, s = 0, d;

        System.out.println("\nProgram for reversing a number");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());

        x = n;
        while (x != 0) {
            d = x % 10;
            s = s * 10 + d;
            x /= 10;
        }
        System.out.printf("The reverse of %d is %d", n, s);

    }
}
