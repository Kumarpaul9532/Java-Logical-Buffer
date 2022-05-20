/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Prime or not.
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {

    public static void main(String[] args) throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, i = 2, d = 0;

        System.out.println("\nProgram for checking Prime Number");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(in.readLine());

        for (; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a Prime number");
                d = 1;
                break;
            }
        }
        if (d == 0)
            System.out.println(n + " is a Prime number");
    }
}
