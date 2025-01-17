package Linear;
public class min2d {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };
        int minValue = findMin(arr);
        System.out.println("Max value: " + minValue);
    }

    static int findMin(int[][] arr2) {
        int max = Integer.MIN_VALUE; // Initialize to the maximum possible value

        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                if (arr2[row][col] > max) {
                    max = arr2[row][col]; // Update min value
                }
            }
        }
        return max; // Return the minimum value found
    }
}
