/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number in Decimal Form as input from the user
                and convert it into Octal Form.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToOctal {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, oct = 0, d, x, c = 1;

        System.out.println("\nProgram for conversion Decimal to Octal");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(in.readLine());

        x = n;
        while (x != 0) {
            d = x % 8;
            oct += d * c;
            x /= 8;
            c *= 10;
        }

        System.out.printf("The octal of %d is %d", n, oct);

    }
}
