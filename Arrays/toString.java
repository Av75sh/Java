package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class toString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];
        for(int i=0; i<str.length; i++){
            str[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(str));
    }
}
