package pattern;
public class pattern6 {
    public static void main(String[] args) {
        patt(5);
    }
    static void patt(int n){
        for(int row=1; row<=n; row++){
            int numofspaces = n - 13;
            for(int s = 1; s<numofspaces; s++){
                System.out.print(" ");
            }

            for(int j=1; j<row; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
