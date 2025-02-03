import java.util.Arrays;

public class bubbl {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6};
        bubble2(arr);
        System.err.println(Arrays.toString(arr));
    }

    static void bubble2(int[] arr){
        boolean swapped;
        for(int i=0; i<arr.length - 1; i++){
            swapped = false;
            for(int j=1; j<arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    static void swap(int[] arr, int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
