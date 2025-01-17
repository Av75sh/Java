// Time complexicity is N*N

package Strings;

public class ascii {
    public static void main(String[] args) {
        String series = " ";
        for(int i=0; i<26; i++){
            char ch = ((char)('a' + i));
            series += ch;
        }
            System.out.print(series);
        
    }
}
