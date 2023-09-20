package searching.linearSearch;

import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of the Array : ");
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        System.out.println("Enter the Element to Search in Array : ");
        int target = sc.nextInt();

        System.out.println(linearSearch(arr, target));

    }
    // search in the array : return the index if item found
    // otherwise return -1

    static int linearSearch(int[] arr, int target) {
        // if the size of the array is 0 simply means no item present in the array
        if (arr.length == 0)
            return -1;

        // run the for loop
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target)
                return index;
        }

        // none of the above loops are executed simply means target not found
        return -1;
    }
}
