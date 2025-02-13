package Revision;

public class path {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, false}
        };

        maze(" ", board, 0, 0);
    }

    static void maze(String p, boolean[][] board, int row, int col){
        if( row == board.length -1 && col == board[0].length - 1){
            System.out.println(p);
            return;
        }

        if(board[row][col] == false) return;
        board[row][col] = false;       // this line make the recursion backtracking 

        if(row < board.length - 1) maze(p + 'D', board, row+1, col);
        if(col < board[0].length - 1) maze(p + 'R', board, row, col+1);
        if(row > 0) maze(p + 'U', board, row-1, col);
        if(col > 0) maze(p + 'L', board, row, col-1);

        board[row][col] = true;       // backtracking
    }
}
