package Functions;
import java.util.Arrays;

public class Swap2{
    public static void main(String[] args){
        int[] arr = {1,34,6,7,89};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] = 67;
    }
}

