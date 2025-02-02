package general;
import java.util.Scanner;

public class trailingzero {
    public int zero() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count = 0;

    while(n >=5 ){
        count = count + n/5;
        n = n/5;
    }
    return count;
}
}
