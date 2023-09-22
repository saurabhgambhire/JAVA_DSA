package LeetCode;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(rotationCount(nums));
//        System.out.println(pivot(nums));
    }

    private static int rotationCount(int[] nums) {
        int pivotIndex = pivot(nums);
        return pivotIndex + 1;
    }

    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;

            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;

            if (nums[mid] <= nums[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

}
