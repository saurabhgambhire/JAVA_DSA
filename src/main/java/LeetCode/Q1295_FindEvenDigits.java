package LeetCode;

public class Q1295_FindEvenDigits {
    public static void main(String[] args) {

//        Input: nums = [12,345,2,6,7896]
//        Output: 2

        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("COUNT : " + findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int elem : nums) {
            if (isEven(elem)) count++;
        }
        return count;
    }

    public static boolean isEven(int elem) {
        return countOf(elem) % 2 == 0;
    }

    private static int countOf(int elem) {

        return (int) Math.log10(elem) + 1;
    }
//    }private static int countOf(int elem) {
//        int count = 0;
//        while (elem > 0) {
//            count++;
//            elem /= 10;
//        }
//        return count;
//    }
}
