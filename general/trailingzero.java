/* Logic
 *      to fund that a number have zero or not we need to check with 10 {5*2 = 10}
 *          As half the number divisible by 2 we only check the divisibilty by 5...
 */


 package general;

import java.util.Scanner;
import java.math.BigInteger; 

public class trailingzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Factorial: " + factorial(n));
        System.out.println("Trailing Zeroes: " + zero(n));

        sc.close();
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static int zero(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}
