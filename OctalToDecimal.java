/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number in Octal Form as input from the user
                and convert it into Decimal Form.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctalToDecimal {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, x, s = 0, c = 1, d;

        System.out.println("\nProgram for conversion Octal to Decimal");
        System.out.print("Enter a number in Octal form : ");
        n = Integer.parseInt(in.readLine());

        x = n;
        while (x != 0) {
            d = x % 10;
            s += c * d;
            c *= 8;
            x /= 10;
        }
        System.out.printf("The decimal of %d is %d", n, s);
    }
}
