package searching;

import java.util.Scanner;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row : ");

        int rows = sc.nextInt();
        System.out.println("Enter the size of Col : ");

        int cols = sc.nextInt();
        System.out.println(" Enter ");

        int[][] arr = new int[rows][cols];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("Enter element you want to search : ");
        int target = sc.nextInt();

        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[][] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == target)
                    return anInt;
            }
        }

        return -1;
    }
}
