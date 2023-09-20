package LeetCode;

public class Q1672_Richest_Customer_Wealth {
    /*
    * Example 1:

            Input: accounts = [[1,2,3],[3,2,1]]
            Output: 6
            Explanation:
            1st customer has wealth = 1 + 2 + 3 = 6
            2nd customer has wealth = 3 + 2 + 1 = 6
            Both customers are considered the richest with a wealth of 6 each, so return 6.
            Example 2:

            Input: accounts = [[1,5],[7,3],[3,5]]
            Output: 10
            Explanation:
            1st customer has wealth = 6
            2nd customer has wealth = 10
            3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.*/
    public int maximumWealth(int[][] accounts) {
        int finaWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth += i;
            }
            finaWealth = Math.max(finaWealth, wealth);
        }
        return finaWealth;
    }
}
