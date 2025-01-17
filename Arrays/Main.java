import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Step 3: Prompt the user for input
        System.out.println("Enter numbers to add to the ArrayList (type -1 to stop):");

        // Step 4: Use a loop to take input
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) { // Sentinel value to break the loop
                break;
            }
            numbers.add(input); // Add the input to the ArrayList
        }

        // Step 5: Print the ArrayList to confirm inputs
        System.out.println("The ArrayList contains: " + numbers);

        // Close the scanner
        scanner.close();
    }
}

