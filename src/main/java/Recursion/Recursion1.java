package Recursion;

public class Recursion1 {
    // Q - print numbers from 1 to 5 with recursion
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
