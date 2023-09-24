package Patterns;

public class Pattern7 {
    /*

* * * * * * * * *
- * * * * * * *
- - * * * * *
- - - * * *
- - - - *

    * */
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("-" + " ");
            }
            for (int col = 0; col < (5 - row) * 2 - 1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
