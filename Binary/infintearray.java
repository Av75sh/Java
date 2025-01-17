package Binary;

public class infintearray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,7,7,7,7,7,7,7,7,7,12,13,141,51,61};
        int target = 7;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

            while(target > arr[end]){
                int newStart = end + 1;
                end = (end - start + 1) * 2;
                start = newStart;
            }
            return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end){
                while(start <= end){
                    int mid = start + (end - start) / 2;

                    if(target > arr[mid]){
                        start = mid + 1;
                    }
                    else if(target < arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        return mid;
                    }
                }
                return -1;
    }
}
