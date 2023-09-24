package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "saurabh";
        System.out.println(a);
        System.out.println(a.hashCode());
        String b = "saurabh";
        System.out.println(b);
        System.out.println(b.hashCode());
        System.out.println(a==b); // true
        b="saurabh";
        System.out.println(b.hashCode()); // same hashcode

        String c = new String("saurabh");
        System.out.println(c.hashCode());
        String d = new String("saurabh");
        System.out.println(d.hashCode());
        System.out.println(c==d);  // false
        System.out.println(c.equals(d)); // true
    }
}
