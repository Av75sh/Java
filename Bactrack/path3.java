import java.util.Arrays;

public class path3 {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        int[][] path = new int[board.length][board[0].length];

        maze(" ", board, 0, 0, path, 1);
    }

    static void maze(String p, boolean[][] board, int row, int col, int[][] path, int step){
        if( row == board.length -1 && col == board[0].length - 1){
            for(int[] arr : path){
                path[row][col] = step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(path);
            System.out.println();
            return;
        }

        if(board[row][col] == false) return;
        board[row][col] = false;       // this line make the recursion backtracking 
        path[row][col] = step;

        if(row < board.length - 1) maze(p + 'D', board, row+1, col, path, step+1);
        if(col < board[0].length - 1) maze(p + 'R', board, row, col+1, path, step+1);
        if(row > 0) maze(p + 'U', board, row-1, col, path, step+1);
        if(col > 0) maze(p + 'L', board, row, col-1, path, step+1);

        board[row][col] = true;       // backtracking
        path[row][col] = 0;
    }
}
