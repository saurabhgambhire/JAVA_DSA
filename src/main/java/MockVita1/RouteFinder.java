package MockVita1;

import java.util.Scanner;

public class RouteFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            matrix[i] = row.toCharArray();
        }

        findRoute(matrix);
    }

    public static void findRoute(char[][] matrix) {
        int n = matrix.length;
        int x = 0, y = 0;

        while (true) {
            char currentChar = matrix[x][y];

            // Check if the current position is the destination
            if (currentChar == 'D') {
                System.out.println("DESTINATION");
                break;
            }

            // Find and print surrounded hurdles
            printSurroundedHurdles(matrix, x, y);

            // Mark the current position as part of the route
            matrix[x][y] = 'R';

            // Move to the next step
            if (x + 1 < n && matrix[x + 1][y] != 'R') {
                x++;
            } else if (y + 1 < n && matrix[x][y + 1] != 'R') {
                y++;
            } else if (x - 1 >= 0 && matrix[x - 1][y] != 'R') {
                x--;
            } else if (y - 1 >= 0 && matrix[x][y - 1] != 'R') {
                y--;
            }
        }
    }

    public static void printSurroundedHurdles(char[][] matrix, int x, int y) {
        int n = matrix.length;
        char[] hurdles = new char[4];
        int count = 0;

        if (x + 1 < n) {
            hurdles[count++] = matrix[x + 1][y];
        }
        if (y + 1 < n) {
            hurdles[count++] = matrix[x][y + 1];
        }
        if (x - 1 >= 0) {
            hurdles[count++] = matrix[x - 1][y];
        }
        if (y - 1 >= 0) {
            hurdles[count++] = matrix[x][y - 1];
        }

        sortHurdles(hurdles);

        if (count == 0) {
            System.out.println("NO HURDLES");
        } else {
            for (int i = 0; i < count; i++) {
                if (hurdles[i] != 'M') {
                    System.out.print(hurdles[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void sortHurdles(char[] hurdles) {
        int n = hurdles.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (hurdles[j] > hurdles[j + 1]) {
                    char temp = hurdles[j];
                    hurdles[j] = hurdles[j + 1];
                    hurdles[j + 1] = temp;
                }
            }
        }
    }
}

