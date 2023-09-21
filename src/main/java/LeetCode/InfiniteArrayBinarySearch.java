package LeetCode;

public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,9,10,14,15,19,20,28,45};
        int target = 19;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        // find the range
        // first start with a box of size 2
        int st = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int newSt = end + 1;
            end = end + ((end - st + 1) * 2);
            st = newSt;
        }
        return binarySearch(arr, target, st, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
