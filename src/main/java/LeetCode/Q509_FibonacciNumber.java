package LeetCode;

public class Q509_FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    static public int fib(int n) {
        if (n < 2)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
