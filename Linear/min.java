package Linear;

public class min {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        minn(arr);
    }

    static void minn(int[] arr){
        if(arr.length == 0){
            System.out.println("Array length is not defined");
        }

        int value = arr[0];

        for(int i=1; i<arr.length; i++){
            if(value > arr[i]){
                value = arr[i];
            }
        }
        System.out.println("Min value is:- " + value);
    }
}
