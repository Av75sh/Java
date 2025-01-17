/*  Time complexicity 
Best => O(1);
Worst => O(log N); */

package Binary;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 1, 5, 8, 11, 15};
        int target = -2;
        System.out.print(Binarysearch(arr, target));
    }

    static int Binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}


