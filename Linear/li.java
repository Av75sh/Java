package Linear;
import java.util.ArrayList;
import java.util.Scanner;

public class li {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("ArrayList size:- ");
        int n = sc.nextInt();

        System.out.print("ArrayList :- ");

       for(int i=0; i<n; i++){
        int element = sc.nextInt();
        list.add(element);
       }

       System.out.println(list);
        if(list.contains(55)){
            System.out.print("We found your message");
        };   
    }
}
