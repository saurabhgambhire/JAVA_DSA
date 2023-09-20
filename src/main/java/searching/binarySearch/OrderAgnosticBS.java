package searching.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 8;
        int[] arr = {9,8,7,6,5,4};
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // find array is Ascending or not
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
//            int mid = (start + end) / 2;
            int mid = (start + (end - start) / 2);
            // check mid is equal to target

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
