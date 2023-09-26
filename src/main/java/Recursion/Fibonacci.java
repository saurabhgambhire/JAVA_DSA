package Recursion;

public class Fibonacci {
    // Q - find N th Fibonacci Number
    public static void main(String[] args) {
        int fibonacci = fibonacci(30);
        System.out.println(fibonacci);
    }

    private static int fibonacci(int num) {
        if (num < 2)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
