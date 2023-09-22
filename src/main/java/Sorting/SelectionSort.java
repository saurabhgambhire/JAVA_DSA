package Sorting;

import java.util.Arrays;

public class SelectionSort {

    // Space Complexity = O(1) --> constant since we were not using extra space
    // Time Complexity
    // Best = O(n2)
    // Worst = O(n2)
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, end);
            arr = swap(arr, end, maxIndex);
        }
        return arr;
    }

    static int[] swap(int[] arr, int endIndex, int maxIndex) {
        int temp = arr[endIndex];
        arr[endIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        return arr;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[start] < arr[i])
                max = arr[i];
        }
        return max;
    }


}
