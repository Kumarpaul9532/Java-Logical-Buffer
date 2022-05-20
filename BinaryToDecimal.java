/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number in Binary Form as input from the user
                and convert it into Decimal Form.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToDecimal {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, x, d, s = 0, c = 1;

        System.out.println("\nProgram for conversion Binary to Decimal");
        System.out.print("Enter number in Binary form : ");
        n = Integer.parseInt(in.readLine());

        x = n;
        while (x != 0) {
            d = x % 10;
            s += c * d;
            c *= 2;
            x /= 10;

        }
        System.out.printf("The decimal of %d is %d", n, s);
    }
}
