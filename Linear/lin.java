package Linear;

public class lin {
    public static void main(String[] args) {
        int[] arr = {45, 56, 89, 99, 5};
      
        linearsearch(arr, 89);
    }

    static void linearsearch(int[] arr, int target){
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element found:- " + target);
                found = true;
                break;
            }
        }
            if(!found){
        System.out.println("Not found:- " + target);
            }
        }
    }
    

