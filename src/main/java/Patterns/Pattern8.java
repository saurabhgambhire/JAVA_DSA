package Patterns;

public class Pattern8 {

    /*
    # - - - #
    - # - # -
    - - # - -
    - # - # -
    # - - - #


     * */
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (row == col || row + col == 4)
                    System.out.print("#" + " ");
                else
                    System.out.print("-" + " ");
            }
            System.out.println();
        }
    }
}
