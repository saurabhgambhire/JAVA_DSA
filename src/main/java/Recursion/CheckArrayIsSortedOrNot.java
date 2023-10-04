package Recursion;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr) {
        int index = 0;
        return check(arr, index);
    }

    static boolean check(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        return arr[index] < arr[index + 1] && check(arr, index + 1);
    }

}
