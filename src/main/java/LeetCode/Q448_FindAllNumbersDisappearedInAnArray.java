package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q448_FindAllNumbersDisappearedInAnArray {
    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }

    static public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            // Mark the corresponding index as negative to indicate that the number is present
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1); // Missing numbers have positive values at their indices
            }
        }

        return ans;
    }


//    static public List<Integer> findDisappearedNumbers(int[] nums) {
//
//        int i = 0;
//        while (i < nums.length) {
//            int correct = nums[i] - 1;
//            if (nums[i] != nums[correct])
//                swap(nums, i, correct);
//            else
//                i++;
//        }
//        System.out.println(Arrays.toString(nums));
//        List<Integer> ans = new ArrayList<>();
//        for (int j = 0; j < nums.length; j++) {
//            if (nums[j] != j + 1)
//                ans.add(j + 1);
//        }
//        return ans;
//    }
//
//    static void swap(int[] arr, int start, int end) {
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//    }
}
