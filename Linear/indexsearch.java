package Linear;

public class indexsearch {
    public static void main(String[] args) {
        int[] arr = {1, 11, 21, 51, 101, 1001};
        int target = 21;
        System.out.println(search(arr, target, 1, 4));
    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    
}