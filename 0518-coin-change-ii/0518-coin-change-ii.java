class Solution {
    public int change(int amount, int[] coins) {

        int dp[][] = new int[coins.length][amount+1];

        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }
        
        return solve(coins,dp,0,0,amount);
    }

    public int solve(int coins[],int dp[][],int i,int sum,int amount)
    {
        if(sum > amount) return 0;
        if(sum==amount)
        {
            return 1;
        }

        if(i==coins.length)
        {
            return 0;
        }

        if(dp[i][sum]!=-1)
        {
            return dp[i][sum];
        }

        int pick = solve(coins,dp,i,sum + coins[i],amount);
        int notpick = solve(coins,dp,i+1,sum,amount);

        return dp[i][sum] = pick + notpick;
    }
}