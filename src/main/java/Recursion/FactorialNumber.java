package Recursion;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }
}
