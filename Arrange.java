/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and print the number in ascending order.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrange {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, i = 0, x, d;

        System.out.println("\nProgram for arranging the digits");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());

        System.out.print("Number in arranged order : ");
        for (; i <= 9; i++) {
            x = n;
            while (x != 0) {
                d = x % 10;
                if (d == i)
                    System.out.print(i);
                x /= 10;
            }
        }
    }
}
