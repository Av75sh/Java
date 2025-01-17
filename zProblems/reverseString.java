// How to reverse a String => 

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String reversed = reverse(s); // Store the reversed string
        System.out.println("The reversed String is: " + reversed);
    }

    static String reverse(String s) {
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }
}
