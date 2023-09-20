package searching.linearSearch;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("MINIMUM_NUMBER : " + minimumNumber(arr));
    }

    static int minimumNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int j : arr) {
            if (min > j)
                min = j;
        }
        return min;
    }
}
