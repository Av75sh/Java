// It reduces the time complexicity

package Strings;
import java.util.Arrays;
public class builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=26; i>=0; i--){
            char ch = ((char)('a' + i));
            builder.append(ch);
        }
        System.out.println(builder.toString());

        String name = "Avinash Singh";
        System.out.println(Arrays.toString(name.toCharArray()));

    }
}

