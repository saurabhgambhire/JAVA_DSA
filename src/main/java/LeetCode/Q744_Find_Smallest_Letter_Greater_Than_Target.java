package LeetCode;

public class Q744_Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {

    }

    public char nextGreatestLetter(char[] letters, char target) {

        if (target == 'z' || target == 'Z') return letters[0];

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }
}
