package pattern;

public class pattern1 {
    public static void main(String[] args) {
        for(int i=0; i<9; i++){
            for(int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
