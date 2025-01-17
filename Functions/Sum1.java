package Functions;
import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.print("Sum of num1 + num2 is: " + sum);

        sc.close(); 
    }
}
