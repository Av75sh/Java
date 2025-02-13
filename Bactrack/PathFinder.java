import java.util.Arrays;

public class PathFinder {
    public static void main(String[] args) {
        boolean[][] avinash = {
            {true, true, false},
            {true, false, true},
            {true, true, true}
        };

        int[][] maze = new int[avinash.length][avinash[0].length];
        backtracking("", avinash, 0, 0, maze, 1);
    }

    static void backtracking(String p, boolean[][] avinash, int row, int col, int[][] maze, int step) {
        if (row == avinash.length - 1 && col == avinash[0].length - 1) {
            maze[row][col] = step;
            for (int[] arr : maze) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if (!avinash[row][col]) return;

        // Mark as visited
        avinash[row][col] = false;
        maze[row][col] = step;

        // Move Right
        if (col < avinash[0].length - 1) 
            backtracking(p + 'R', avinash, row, col + 1, maze, step + 1);
        
        // Move Down
        if (row < avinash.length - 1) 
            backtracking(p + 'D', avinash, row + 1, col, maze, step + 1);
        
        // Move Up
        if (row > 0) 
            backtracking(p + 'U', avinash, row - 1, col, maze, step + 1);
        
        // Move Left
        if (col > 0) 
            backtracking(p + 'L', avinash, row, col - 1, maze, step + 1);

        // Backtrack
        avinash[row][col] = true;
        maze[row][col] = 0;
    }
}
