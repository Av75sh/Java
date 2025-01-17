package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array value:- ");
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        reverse(arr);
      
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println("Reverse:- " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

   
}
