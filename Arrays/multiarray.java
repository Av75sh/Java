package Arrays;
import java.util.Scanner;

public class multiarray {
    public static void main(String[] args){

        // int[][] arr = new int[3][4];  array length = no. of rows 

    /*    int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    */
    int[][] arr = new int[3][2];

    Scanner sc = new Scanner(System.in);
    for(int row = 0; row < arr.length; row++){
        for(int col = 0; col < arr[row].length; col++){
            arr[row][col] = sc.nextInt();
        }
        System.out.println();
    }
    System.out.println("2D Array:- " +arr);
    }
}
