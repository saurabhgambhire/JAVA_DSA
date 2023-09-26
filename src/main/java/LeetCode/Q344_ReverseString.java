package LeetCode;

import java.util.Arrays;

public class Q344_ReverseString {
    // https://leetcode.com/problems/reverse-string/description/

    public static void main(String[] args) {
    char[] arr = {'h','e','l','l','o'};
    reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }

    static public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

   static public void reverse(char[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
}
