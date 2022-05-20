/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and print the sum of its digit.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigit {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, s = 0, x, d;

        System.out.println("\nProgram for sum of digit");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());

        x = n;
        while (x != 0) {
            d = x % 10;
            s += d;
            x /= 10;
        }
        System.out.printf("The sum of digits of %d is %d", n, s);

    }
}
