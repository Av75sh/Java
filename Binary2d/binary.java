package Binary2d;
import java.util.Arrays;

 // Time complexicity is n+n = (2n);

public class binary {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {50, 60, 70},
            {80, 90, 100},
        };

        System.out.println("Index of array is:- " +Arrays.toString(search(arr, 30)));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col > 0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }

            if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
