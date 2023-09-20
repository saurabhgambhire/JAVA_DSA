package searching.linearSearch;

import java.util.Scanner;

public class MaxIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Row : ");
        int rows = sc.nextInt();

        System.out.println("Enter the size of Col : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("MAX_ELEMENT : " + maxElementIn2D(arr));
    }

    static int maxElementIn2D(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
