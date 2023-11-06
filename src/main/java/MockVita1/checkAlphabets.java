package MockVita1;

import java.util.*;
public class checkAlphabets {
    public static void main(String[] args) {
        String str = "abcdefghijaklmnopqrstuvwxy";
        Set<Character> alphabets = new HashSet<>();
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabets.add(ch);
        }
        for (char ch : str.toCharArray()){
            if (alphabets.contains(ch)) {
                alphabets.remove(ch);
            }
        }

        if (alphabets.isEmpty()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}
