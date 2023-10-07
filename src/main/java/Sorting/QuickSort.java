package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int low = 0;
        int high = arr.length;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

//    static void quickSort(int[] arr, int low, int high) {
//
//        if (low >= high)
//            return;
//
//        int start = low;
//        int end = high;
//
//        int mid = start + (end - start) / 2;
//
//        int pivot = arr[mid];
//
//        while (start <= end) {
//            while (arr[start] < pivot)
//                start++;
//
//            while (arr[end] > pivot)
//                end--;
//
//            if (start <= end) {
//                //swap
//                int temp = arr[start];
//                arr[start] = arr[end];
//                arr[end] = temp;
//                start++;
//                end--;
//            }
//        }
//
//        quickSort(arr, low, end);
//        quickSort(arr, start, high);
//
//    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array, and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the two sub-arrays
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choose the pivot as the first element
        int i = low; // Index of the smaller element

        for (int j = low + 1; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i] and arr[low] (the pivot)
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        return i;
    }

}

