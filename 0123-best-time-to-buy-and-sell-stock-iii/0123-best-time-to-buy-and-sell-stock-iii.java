class Solution {
    public int maxProfit(int[] prices)
    {
        int dp[][][] = new int[prices.length][2][3];

        for(int b[][]:dp)
        {
            for(int a[]:b)
            {
                Arrays.fill(a,-1);
            }
        }
        
        return solve(prices,dp,0,2,1);
    }

    public int solve(int[] prices,int dp[][][], int i, int cap, int buy)
    {

        if(cap==0)
        {
            return 0;
        }

        if(i==prices.length)
        {
            return 0;
        }


        int profit= Integer.MIN_VALUE;

        if(dp[i][buy][cap]!=-1)
        {
            return dp[i][buy][cap];
        }

        if(buy==1)
        {
            profit = Math.max(-prices[i]+solve(prices,dp,i+1,cap,0) , 0 + solve(prices,dp,i+1,cap,1));
        }
        else
        {
            profit = Math.max(prices[i]+solve(prices,dp,i+1,cap-1,1) , 0 + solve(prices,dp,i+1,cap,0));
        }

        dp[i][buy][cap]=profit;

        return profit;
    }
}