package Sorting;

import java.util.Arrays;

public class BubbleSort {

    // it a comparison sort method
    // sinking sort
    // exchange sort

    // space Complexity = O(1) = constant
    // Time Complexity
        // Best Case = O(n) where n is size of array and array may be sorted
        // Worst Case = O(n2)
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }
}
