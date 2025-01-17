package Binary;
import java.util.Scanner;
import java.util.Arrays;

public class complete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter your array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array: " + Arrays.toString(arr));

        // Determine the order of the array
        if (arr[0] < arr[n - 1]) {
            System.out.println("The array is sorted in ascending order.");
        } else if (arr[0] > arr[n - 1]) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array has identical elements or is unsorted.");
            sc.close();
            return;
        }

        // Perform binary search based on the order
        int target = 15;
        int result = binarysearch(arr, target, arr[0] < arr[n - 1]); // Pass order as a parameter

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }

        sc.close(); // Close the scanner
    }

    public static int binarysearch(int[] arr, int target, boolean isAscending) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            }

            if (isAscending) {
                // Ascending order logic
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // Descending order logic
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // Target not found
    }
}
