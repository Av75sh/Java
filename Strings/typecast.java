package Strings;
import java.util.ArrayList;

public class typecast {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));


        System.out.println("Avinash" + new ArrayList<>());
        System.out.println("Avinash" + new Integer(29));

        String ans = new Integer(29) + " " + new ArrayList<>();
        System.out.println(ans);
    }
}
