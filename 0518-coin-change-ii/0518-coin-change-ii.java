
class Solution {
    public int change(int amount, int[] coins) {

        int n = coins.length;

        int dp[][] = new int[n+1][amount+1];

        dp[n][amount] = 1;

        for(int i=n-1; i>=0; i--) {

            for(int sum=amount; sum>=0; sum--) {

                int pick = 0;

                if(sum + coins[i] <= amount) {
                    pick = dp[i][sum + coins[i]];
                }

                int notpick = dp[i+1][sum];

                dp[i][sum] = pick + notpick;
            }
        }

        return dp[0][0];
    }
}
