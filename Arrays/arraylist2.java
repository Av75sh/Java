package Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class arraylist2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        ArrayList<Integer> list = new ArrayList<>();

        int numbers = in.nextInt();

        System.out.println("ArrayList:- ");
        list.add(numbers);

        System.out.println(numbers);
    }
}