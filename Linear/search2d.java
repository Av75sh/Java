package Linear;
import java.util.Arrays;

public class search2d {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };

        int target = 5;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr2, int target) {
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                if (target == arr2[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1}; 
    }
}
