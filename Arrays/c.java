package Arrays;
import java.util.Arrays;

public class c {
    public static void main(String[] args){
        int[] arr = {3,4,5,6};

        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 1;
    }
}
