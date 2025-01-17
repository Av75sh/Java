package general;

public class sort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 3, 6, 9, 10, 23, 2};
        sort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // Assume the current index is the minimum
            for (int j = i + 1; j < arr.length; j++) { // Find the smallest in the unsorted portion
                if (arr[j] < arr[min]) {
                    min = j; // Update the index of the smallest element
                }
            }
            // Swap the found minimum element with the first element of the unsorted portion
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
