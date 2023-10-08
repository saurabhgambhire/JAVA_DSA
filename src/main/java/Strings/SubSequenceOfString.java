package Strings;

import java.util.ArrayList;

public class SubSequenceOfString {
    public static void main(String[] args) {
//        subSequence("", "abc");
        ArrayList<String> list = subSequence1("", "abc");
        System.out.println(list);
    }

    private static void subSequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSequence(p + ch, up.substring(1));
        subSequence(p, up.substring(1));
    }

    private static ArrayList<String> subSequence1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> strings = new ArrayList<>();
            strings.add(p);
            return strings;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSequence1(ch + p, up.substring(1));
        ArrayList<String> right = subSequence1(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
