/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number in Decimal Form as input from the user
                and convert it into Binary Form.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToBinary {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d, bin = 0, n, b = 1, x;

        System.out.println("\nProgram for conversion Decimal to Binary");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());

        x = n;
        while (x != 0) {
            d = x % 2;
            bin += d * b;
            x /= 2;
            b *= 10;
        }

        System.out.printf("The binary of %d is %d", n, bin);
    }
}
