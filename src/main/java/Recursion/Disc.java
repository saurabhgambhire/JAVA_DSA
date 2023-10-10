package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Disc {
    public static void main(String[] args) {
        List<String> list = disc1("", 4);
        System.out.println(list);
    }

    static void disc(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            disc(p + i, target - i);
        }
    }

    static List<String> disc1(String p, int target) {
        if (target == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(disc1(p + i, target - i));
        }
        return list;
    }
}

