package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array value:- ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int minValue = arr[0];

        for(int i=1; i<arr.length; i++){
            if(minValue < arr[i]){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
