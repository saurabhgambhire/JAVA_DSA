package CodeVita;

public class Pair {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 0, 3, 4, 2};
        int target = 5;
        int j =0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] + arr[j] == target)
            {
                System.out.println(arr[i ]+" "+arr[j]);
                j++;
            }
        }

    }
}
