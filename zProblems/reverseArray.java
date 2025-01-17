//Using Two Pointer method

import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        System.out.println("Orignal Array:- " + Arrays.toString(arr));
        reverse(arr);
        System.out.print("Reversed Array:- " + Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        start++;
        end--;
        }
    }
}
