/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept a number as input from the user
                and check whether the number is Magic number or not.
   IDE        : VS Code             */

/*  Sum of its digit is calculated till a single digit, and it should be equal to 1. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magic {

    public static void main(String[] args)throws IOException {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int n, s = 0, d, x;

        System.out.println("\nProgram for cheching Magic Number");
        System.out.print("Enter a number : ");
        n = Integer.parseInt(in.readLine());

        x = n;
        for (;;) {
            s = 0;
            while (x != 0) {
                d = x % 10;
                s += d;
                x /= 10;
            }
            if (s > 9)
                x = s;
            else
                break;
        }
        if (s == 1)
            System.out.println(n + " is a Magic number");
        else
            System.out.println(n + " is not a Magic number");
    }
}
