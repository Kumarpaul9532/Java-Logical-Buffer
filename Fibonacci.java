/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to print the first n terms of Fibonacci series.
                0 , 1 , 1 , 2 , 3 , 5 ..... n
   IDE        : VS Code             */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, a = -1, b = 1, c = 0, i = 1;

        System.out.println("\nProgram to find the first n terms of Fibonacci series");
        System.out.print("Enter the number of terms : ");
        n = Integer.parseInt(br.readLine());

        for (; i <= n; i++) {
            c = a + b;
            System.out.print(c);
            a = b;
            b = c;
            if (i < n)
                System.out.print(", ");
        }
        System.out.println(".");

    }
}
