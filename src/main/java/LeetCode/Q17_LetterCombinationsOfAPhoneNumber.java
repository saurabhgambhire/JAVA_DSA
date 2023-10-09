package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Q17_LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        List<String> list = letterCombinations("23");
        System.out.println(list);
    }

    public static List<String> letterCombinations(String digits) {
        return combinations("", digits);
    }

    private static List<String> combinations(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            List<String> combinations = combinations(p + ch, up.substring(1));
            list.addAll(combinations);
        }
        return list;
    }
}
