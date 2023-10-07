package Strings;

public class SkipAsInString {
    public static void main(String[] args) {
        skipAs("", "abdfabcd");
        System.out.println(skipAs1("asdsaaaaaaasd"));
        System.out.println(skipApple("skipappleinstring"));
    }

    static void skipAs(String newString, String oldString) {
        if (oldString.isEmpty()) {
            System.out.println(newString);
            return;
        }

        char ch = oldString.charAt(0);

        if (ch == 'a')
            skipAs(newString, oldString.substring(1));
        else
            skipAs(newString + ch, oldString.substring(1));
    }

    static String skipAs1(String oldString) {
        if (oldString.isEmpty()) {
            return "";
        }

        char ch = oldString.charAt(0);

        if (ch == 'a')
            return skipAs1(oldString.substring(1));
        else
            return ch + skipAs1(oldString.substring(1));
    }

    static String skipApple(String str) {
        if (str.isEmpty())
            return "";

        if (str.startsWith("apple"))
            return skipApple(str.substring(5));
        else
            return str.charAt(0) + skipApple(str.substring(1));
    }
}
