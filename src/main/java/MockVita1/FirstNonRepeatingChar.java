package MockVita1;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "hello world hi hey";
        String result = findFirstNonRepeatingCharacter(input);
        System.out.println(result);
    }

    public static String findFirstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256];
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return String.valueOf(c);
            }
        }
        return "";
    }
}
