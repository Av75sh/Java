package pattern;
public class pattern4 {
    public static void main(String[] args) {
        patt(5);
    }
    static void patt(int n){
        for(int row=1; row < 2*n; row++){
            int solution = row > n ? 2*n - row : row;
            for(int col=0; col<solution; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
