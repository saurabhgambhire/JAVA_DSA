package LeetCode;

public class Q1342_NumberOfStepsToReduceANumberToZero {

    //https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

    public static void main(String[] args) {
    int num = 14;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        return  countSteps(num, count);
    }

    private static int countSteps(int num, int count) {
        if (num == 0)
            return count;
        if (num%2==0)
            return countSteps(num/2, count+1);
        else
            return countSteps(num-1, count+1);
    }
}
