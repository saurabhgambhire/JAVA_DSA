package Strings;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceOfString {
    public static void main(String[] args) {
//        subSequence("", "abc");
//        ArrayList<String> list = subSequence1("", "abc");
//        System.out.println(list);
//        ArrayList<String> strings = subSequenceAscii("", "abc");
//        System.out.println(strings);

        int[] arr = {1,2,3};
        List<List<Integer>> subset = subset(arr);
        subset.forEach(integers -> {
            System.out.println(integers);
        });

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

    private static ArrayList<String> subSequenceAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> strings = new ArrayList<>();
            strings.add(p);
            return strings;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSequenceAscii(ch + p, up.substring(1));
        ArrayList<String> subSequenceAscii = subSequenceAscii(p + (ch + 0), up.substring(1));
        ArrayList<String> right = subSequenceAscii(p, up.substring(1));
        left.addAll(right);
        left.addAll(subSequenceAscii);
        return left;
    }

    private static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}

