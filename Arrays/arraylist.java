package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(11);
        list.add(21);

        list.set(0, 1);
    
    System.out.println(list);

    // to check
    System.out.println(list.contains(11));

    System.out.print("Enter value:-  ");
    for(int i=0; i<5; i++){
       list.add(sc.nextInt());
    }
    System.out.println(list);
    }
}
