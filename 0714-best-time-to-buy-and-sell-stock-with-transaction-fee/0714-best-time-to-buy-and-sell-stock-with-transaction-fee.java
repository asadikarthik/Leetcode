class Solution {
    public int maxProfit(int[] prices, int fee) {
        
        
        int dp[][] = new int[prices.length][2];

        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }

        return solve(dp,prices,0,1,fee);
    }

    public int solve(int dp[][] ,int[] prices, int i , int buy,int fee)
    {
        if(i==prices.length)
        {
            return 0;
        }

        if(dp[i][buy]!=-1)
        {
            return dp[i][buy];
        }
        int profit= Integer.MIN_VALUE;
        if(buy==1)
        {
            profit = Math.max(-prices[i]-fee+solve(dp,prices,i+1,0,fee), 0+solve(dp,prices,i+1,1,fee));
        }
        else
        {
            profit = Math.max(prices[i]+solve(dp,prices,i+1,1,fee) , 0+solve(dp,prices,i+1,0,fee));
        }

        dp[i][buy]=profit;

        return profit;
    }
}