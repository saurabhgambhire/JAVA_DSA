package Strings;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    private static boolean isPalindrome(String str) {
        int st = 0;
        int end = str.length() - 1;
        while (st < end) {
            if (str.charAt(st) != str.charAt(end))
                return false;
            else
                st++;
                end--;
        }
        return true;
    }

//    static boolean isPalindrome(String str) {
//        StringBuffer stringBuffer = new StringBuffer(str);
//        return stringBuffer.equals(stringBuffer.reverse());
//    }
}
