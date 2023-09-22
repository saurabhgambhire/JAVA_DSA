package searching.binarySearch;

import java.util.Arrays;

public class BinarySearchWith_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 21, 32, 40},
                {11, 22, 33, 43},
                {12, 23, 34, 44},
                {13, 24, 35, 46}
        };
        int target = 24;
        System.out.println(Arrays.toString(binarySearch(arr, target)));

    }

    static int[] binarySearch(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < arr.length && end >= 0) {
            if (arr[start][end] == target)
                return new int[]{start, end};
            if (arr[start][end] < target)
                start++;
            else
                end--;
        }
        return new int[]{-1, -1};
    }
}
