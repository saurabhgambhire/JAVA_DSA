package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3, 3));
        List<String> maze = maze("", 3, 3);
        System.out.println(maze);
    }

    public static int maze(int r, int c) {
        if (r == 1 || c == 1)
            return 1;

        int right = maze(r, c - 1);
        int left = maze(r - 1, c);
        return left + right;
    }

    public static List<String> maze(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();
        if (r > 1) {
            List<String> maze = maze(p + "D", r - 1, c);
            list.addAll(maze);
        }

        if (c > 1) {
            List<String> maze = maze(p + "R", r, c - 1);
            list.addAll(maze);
        }
        return list;
    }
}
