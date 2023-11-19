package BackTracking;

import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
//        backTracking("", board, 0, 0);
        backTrackingPathPrint("", board, 0, 0, path, 1);

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

    static void backTrackingPathPrint(String p, boolean[][] board, int r, int c, int[][] path, int step) {

        if (r == board.length - 1 && c == board[0].length - 1) {
            path[r][c] = step;
            for (int[] ints : path) {
                System.out.println(Arrays.toString(ints));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!board[r][c])
            return;

        board[r][c] = false;
        path[r][c] = step;

        if (r > 0)
            backTrackingPathPrint(p + "U", board, r - 1, c, path, step + 1);

        if (r < board.length - 1)
            backTrackingPathPrint(p + "D", board, r + 1, c, path, step + 1);

        if (c > 0)
            backTrackingPathPrint(p + "L", board, r, c - 1, path, step + 1);

        if (c < board[0].length - 1)
            backTrackingPathPrint(p + "R", board, r, c + 1, path, step + 1);

        board[r][c] = true;
        path[r][c] = 0;

    }
}
