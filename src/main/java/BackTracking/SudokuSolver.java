package BackTracking;

public class SudokuSolver {
    public static void main(String[] args) {

        int[][] board = new int[][]{
                {0, 0, 1, 7, 0, 9, 0, 8, 0},
                {0, 0, 8, 0, 2, 0, 0, 0, 6},
                {9, 0, 0, 1, 0, 0, 0, 7, 2},

                {0, 0, 0, 0, 0, 0, 0, 6, 5},
                {6, 0, 7, 0, 0, 0, 2, 0, 8},
                {8, 9, 0, 0, 0, 0, 0, 0, 0},

                {4, 7, 0, 0, 0, 2, 0, 0, 9},
                {5, 0, 0, 0, 9, 0, 7, 0, 0},
                {0, 1, 0, 5, 0, 6, 8, 0, 0}
        };
        solve(board);
        display(board);

    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            if (emptyLeft == false)
                break;
        }
        if (emptyLeft == true)
            return true;

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }

        }
        return false;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            // check if the number is in the row
            if (board[row][col] == num)
                return false;
        }
        // for col
        for (int[] nums : board) {
            if (nums[col] == num)
                return false;
        }

        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num)
                    return false;
            }
        }
        return true;
    }
}
