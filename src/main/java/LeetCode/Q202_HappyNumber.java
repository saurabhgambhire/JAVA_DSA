package LeetCode;

public class Q202_HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast );

        return slow == 1;
    }

    private static int square(int num)
    {
        int ans = 0;
        while(num > 0)
        {
            int rem = num % 10;
            ans += rem * rem ;
            num /= 10;
        }
        return ans;
    }
}
