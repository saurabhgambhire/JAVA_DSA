package MockVita1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        int q = Integer.MAX_VALUE;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num < q) {
                q = num;
            }
        }

        int p = q; // Initialize p as q
        boolean found = false;

        while (!found) {
            p++;
            found = true;

            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (num != q && p % num != q) {
                    found = false;
                    break;
                }
            }
        }

        if (isPrime(p)) {
            System.out.println(p);
        } else {
            System.out.println("None");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
