package Recursion;

import java.util.ArrayList;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 6, 8, 2};
        int element = 2;
        System.out.println(isPresent(arr, element));
        System.out.println(findAllIndexes(arr, 0, element, new ArrayList<>()));
        System.out.println(findAllIndexes2(arr, 0, element));
    }

    static boolean isPresent(int[] arr, int element) {
        int index = 0;
        return findElement(arr, index, element);
    }

    private static boolean findElement(int[] arr, int index, int element) {
        if (index == arr.length - 1)
            return false;
        return arr[index] == element || findElement(arr, index + 1, element);
    }

    static ArrayList<Integer> findAllIndexes(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length)
            return list;

        if (arr[index] == target)
            list.add(index);

        return findAllIndexes(arr, index + 1, target, list);
    }

    static ArrayList<Integer> findAllIndexes2(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length)
            return list;

        if (arr[index] == target)
            list.add(index);

        ArrayList<Integer> allIndexes = findAllIndexes(arr, index + 1, target, list);
        list.addAll(allIndexes);
        return list;
    }

}
