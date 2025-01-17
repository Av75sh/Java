package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Max {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Array size:- ");
        int n = in.nextInt();


        int[] arr = new int[n];
        System.out.print("Array value:- ");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println();
            System.out.println("Actual array is:- " + Arrays.toString(arr));  

            // Multi array: - Arrays.deepToString()

            System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxValue = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.print("Max value is:- ");
        return maxValue;
    }
}
