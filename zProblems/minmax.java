// Find minimum and maximum in java


public class minmax {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 56, 10000, 167};

     
        int[] result = getMinMax(arr);
        System.out.println("Minimum Element: " + result[0]);
        System.out.println("Maximum Element: " + result[1]);
    }

    public static int[] getMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[] {min, max};
    }
}

