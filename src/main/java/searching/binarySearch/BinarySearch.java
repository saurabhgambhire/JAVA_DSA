package searching.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 50;
        System.out.println(binarySearch(arr, target));

    }

    // return the index
    // return -1 if does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
//            int mid = (start + end) / 2;
            int mid = (start + (end - start) / 2);
            // check mid is equal to target
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else return mid;
        }
        return -1;
    }
}
