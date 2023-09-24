package Strings;

public class PrettyPrinting {
            /*
            %% – Inserts a “%” sign
        %x/%X – Integer hexadecimal
        %t/%T – Time and Date
        %s/%S – String
        %n – Inserts a newline character
        %o – Octal integer
        %f – Decimal floating-point
        %e/%E – Scientific notation
        %g – Causes Formatter to use either %f or %e, whichever is shorter
        %h/%H – Hash code of the argument
        %d – Decimal integer
        %c – Character
        %b/%B – Boolean
        %a/%A – Floating-point hexadecimal
    * */
    public static void main(String[] args) {
        float f = 4975.94975f;
        System.out.printf("%.2f",f);  // till two decimal digits
        System.out.printf("%t");
    }
}
