package MockVita1;

import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[10][10];
        int start = 0;
        int end = 0;

        // Parse the input and initialize the board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                String token = scanner.next();
                if (token.equals("Start")) {
                    start = 10 * i + j + 1;
                } else if (token.equals("End")) {
                    end = 10 * i + j + 1;
                }
                board[i][j] = token;
            }
        }

        int[] dieInputs = new int[scanner.nextInt()];
        for (int i = 0; i < dieInputs.length; i++) {
            dieInputs[i] = scanner.nextInt();
        }

        scanner.close();

        // Simulate player's movement and count snakes and ladders encountered
        int currentPosition = start;
        int snakesEncountered = 0;
        int laddersEncountered = 0;

        for (int dieInput : dieInputs) {
            int nextPosition = currentPosition + dieInput;
            if (nextPosition <= end) {
                String token = board[(nextPosition - 1) / 10][(nextPosition - 1) % 10];
                if (token.startsWith("S(")) {
                    int snakePos = Integer.parseInt(token.substring(2, token.length() - 1));
                    snakesEncountered++;
                    nextPosition = snakePos;
                } else if (token.startsWith("L(")) {
                    int ladderPos = Integer.parseInt(token.substring(2, token.length() - 1));
                    laddersEncountered++;
                    nextPosition = ladderPos;
                }
                currentPosition = nextPosition;
            }
        }

        // Check if the player reaches the End
        if (currentPosition == end) {
            System.out.println("Possible " + snakesEncountered + " " + laddersEncountered);
        } else {
            System.out.println("Not possible " + snakesEncountered + " " + laddersEncountered + " " + currentPosition);
        }
    }
}
