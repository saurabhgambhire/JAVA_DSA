package LeetCode;

import java.util.Arrays;

public class Q287_FindTheDuplicateNumber {

    //    https://leetcode.com/problems/find-the-duplicate-number/
    public static void main(String[] args) {

        int[] nums = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(nums));

    }

    static public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct])
                    swap(nums, i, correct);
                else
                    return nums[i];
            } else
                i++;
        }
        return -1;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
