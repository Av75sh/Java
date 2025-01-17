package pattern;

public class pattern5 {
    public static void main(String[] args) {
        patt(5);
    }

    static void patt(int n){
        for(int row=1; row<2*n; row++){
            int solution = row > n ? 2*n-row : row;

            int numofspaces = n-solution;
            for(int s =0; s<numofspaces; s++){
                System.out.print(" ");
            }
            for(int col=1; col<solution; col++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
