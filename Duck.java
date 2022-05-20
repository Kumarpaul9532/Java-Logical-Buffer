/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Duck number or not.
   IDE        : VS Code             */

/* If the number contains 0 , except in the beginning then
    the number is called  Duck number.    */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Duck {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, x, d, c = 0;

        System.out.println("\nProgram for checking Duck Number");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());

        x = n;
        while (x != 0) {
            d = x % 10;
            if (d == 0) {
                c = 1;
                System.out.println(n + " is a Duck number");
                break;
            }
            x /= 10;
        }

        if (c == 0)
            System.out.println(n + " is not a Duck number");

    }
}