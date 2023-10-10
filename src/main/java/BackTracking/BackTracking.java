package BackTracking;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        backTracking("", board, 0, 0);
    }

    static void backTracking(String p, boolean[][] board, int r, int c) {
        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!board[r][c])
            return;

        board[r][c] = false;

        if (r > 0)
            backTracking(p + "U", board, r - 1, c);

        if (r < board.length - 1)
            backTracking(p + "D", board, r + 1, c);

        if (c > 0)
            backTracking(p + "L", board, r, c - 1);

        if (c < board[0].length - 1)
            backTracking(p + "R", board, r, c + 1);

        board[r][c] = true;

    }
}
