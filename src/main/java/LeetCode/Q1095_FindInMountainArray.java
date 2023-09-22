package LeetCode;

public class Q1095_FindInMountainArray {

//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int n = mountainArr.length();
//        int peakIndex = peakIndexInMountainArray(mountainArr);
//
//        int firstTry = orderAgnosticBS(mountainArr, target, 0, peakIndex);
//        if (firstTry != -1)
//            return firstTry;
//        return orderAgnosticBS(mountainArr, target, peakIndex + 1, n - 1);
//
//    }
//
//    public int peakIndexInMountainArray(MountainArray mountainArray) {
//        int start = 0;
//        int end = mountainArray.length() - 1;
//
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (mountainArray[mid] > mountainArray[mid + 1])
//                end = mid;
//            else
//                start = mid + 1;
//        }
//        return start;
//    }
//
//    static int orderAgnosticBS(MountainArray mountainArray, int target, int start, int end) {
//
//        // find array is Ascending or not
//        boolean isAsc = mountainArray[start] < mountainArray[end];
//
//        while (start <= end) {
////            int mid = (start + end) / 2;
//            int mid = (start + (end - start) / 2);
//            // check mid is equal to target
//
//            if (mountainArray[mid] == target) {
//                return mid;
//            }
//
//            if (isAsc) {
//                if (target < mountainArray[mid])
//                    end = mid - 1;
//                else
//                    start = mid + 1;
//            } else {
//                if (target > mountainArray[mid])
//                    end = mid - 1;
//                else
//                    start = mid + 1;
//            }
//        }
//        return -1;
//    }

//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int n = mountainArr.length();
//        // Find the peak of the mountain array
//        int peakIndex = findPeak(mountainArr, 0, n - 1);
//
//        // Search for the target in the increasing subarray
//        int result = binarySearchIncreasing(mountainArr, target, 0, peakIndex);
//        if (result != -1) {
//            return result;
//        }
//
//        // Search for the target in the decreasing subarray
//        return binarySearchDecreasing(mountainArr, target, peakIndex + 1, n - 1);
//    }
//
//    // Binary search to find the peak of the mountain array
//    private int findPeak(MountainArray mountainArr, int left, int right) {
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
//                left = mid + 1;
//            } else {
//                right = mid;
//            }
//        }
//        return left;
//    }
//
//    // Binary search in the increasing subarray
//    private int binarySearchIncreasing(MountainArray mountainArr, int target, int left, int right) {
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            int midValue = mountainArr.get(mid);
//            if (midValue == target) {
//                return mid;
//            } else if (midValue < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }
//
//    // Binary search in the decreasing subarray
//    private int binarySearchDecreasing(MountainArray mountainArr, int target, int left, int right) {
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//            int midValue = mountainArr.get(mid);
//            if (midValue == target) {
//                return mid;
//            } else if (midValue < target) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return -1;
//    }

}
