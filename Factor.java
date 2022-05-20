/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and print the factors of the number.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factor {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, i = 1;

        System.out.println("\nProgram for finding factor of a number");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(in.readLine());

        System.out.println("The factors of " + n + " are : ");
        while (i <= n / 2) {
            if (n % i == 0)
                System.out.print(i + "\t");
            i++;
        }
    }
}
