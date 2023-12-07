package CodeVita;

import java.util.TreeSet;

public class ReverseString {
    public static void main(String[] args) {
        String saurabh = "saurabh";
        StringBuffer str = new StringBuffer(saurabh);
        int st = 0;
        int end = str.length();

//        for (int i = saurabh.length()-1; i >= 0; i--) {
//            str.append(saurabh.charAt(i));
//        }

        str.reverse();

        TreeSet<Character> set = new TreeSet<>();
        for (int i = 0; i < saurabh.length(); i++) {
            set.add(saurabh.charAt(i));
        }

        System.out.println(set);

//        System.out.println(str);

    }
}
