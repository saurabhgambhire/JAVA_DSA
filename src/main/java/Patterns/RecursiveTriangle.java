package Patterns;

import java.util.Arrays;

public class RecursiveTriangle {
    public static void main(String[] args) {
        triangle(5, 0);
    }

    static void triangle(int row, int col) {
        if (row == 0)
            return;

        if (col < row) {
            System.out.print("*" + " ");
            triangle(row, col + 1);
        } else {
            System.out.println(" " + " ");
            triangle(row - 1, 0);
        }
    }


}
