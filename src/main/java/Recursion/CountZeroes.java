package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZero(1000001));
    }

    static int countZero(int n) {
        int count = 0;
        // helper method
        return count(n, count);
    }

    private static int count(int n, int count) {
        if (n == 0)
            return count;
        if (n % 10 == 0)
            return count(n / 10, count + 1);

        return count(n / 10, count);
    }
}
