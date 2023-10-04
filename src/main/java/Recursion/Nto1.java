package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        recursion2(10);
    }

    static void recursion(int n) {
        if (n == 0)
            return;
        recursion(n - 1);
        System.out.println(n);
    }

    static void recursion1(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        recursion(n - 1);
    }

    static void recursion2(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        recursion(n - 1);
        System.out.println(n);
    }
}
