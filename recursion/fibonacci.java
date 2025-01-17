package recursion;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers you want:- ");
        int n = sc.nextInt();

        System.out.println(series(n));
    }

    static int series(int n){
        if(n < 2){
            return n;
        }

        return series(n-1) + series(n-2);
    }
}
