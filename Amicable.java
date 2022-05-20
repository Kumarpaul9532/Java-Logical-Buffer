/* Programmer : Paul Kumar
   Date       : 19/05/2022
   Topic      : WAP in JAVA to accept two numbers as input from the user
                and check whether the numbers forms Amicable pair or not.
   IDE        : VS Code             */

/*    Sum of divisor of 1st number is equal to second number and 
      Sum of divisor of 2nd number is equal to 1st number.           */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Amicable {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m, n, i = 1, s = 0, c = 0;

        System.out.println("\nProgram for checking Amicable pairs");
        System.out.print("Enter two numbers : ");
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        for (; i <= m / 2; i++) {
            if (m % i == 0)
                s += i;
        }

        if (s == n) {
            for (i = 1; i <= n / 2; i++) {
                if (n % i == 0)
                    c += i;
            }
            if (c == m)
                System.out.printf("%d and %d are Amicable pairs", m, n);
            else
                System.out.printf("%d and %d are not Amicable pairs", m, n);
        } else
            System.out.printf("%d and %d are not Amicable pairs", m, n);

    }
}
