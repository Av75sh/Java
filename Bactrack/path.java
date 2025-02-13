public class path {
    public static void main(String[] args) {
        path2("", 3, 3);
    }

    static void path2(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            path2(p + "D ", row - 1, col);
        }
        if (col > 1) {
            path2(p + "R ", row, col - 1);
        }
    }
}
