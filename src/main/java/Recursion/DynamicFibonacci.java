package Recursion;

public class DynamicFibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(50));

    }

    static long fibonacci(int n) {
        if (n < 2) return n;
        long[] fibo = new long[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++)
            fibo[i] = fibo[i - 1] + fibo[i - 2];

        return fibo[n - 1] + fibo[n - 2];
    }
}
