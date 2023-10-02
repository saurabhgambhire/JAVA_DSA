package LeetCode;

import java.util.Arrays;

public class Q832_FlippingAnImage {

    //    https://leetcode.com/problems/flipping-an-image/description/
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        System.out.println(Arrays.toString(flipAndInvertImage(image)));

    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int[] ans : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = ans[i] ^ 1;
                ans[i] = ans[image[0].length - i - 1] ^ 1;
                ans[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
