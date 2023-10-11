package BackTracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, n));
    }

    public static int knights(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;

        // Placing the Queen and checking every row and column
        for (int col = 0; col < board.length; col++) {
            //place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += knights(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1])
                return false;
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2])
                return false;
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1])
                return false;
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2])
                return false;
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.print("K" + " ");
                else
                    System.out.print("X" + " ");
            }
            System.out.println();
        }
    }

}
