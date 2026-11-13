class Solution {
    public int maxProfit(int k, int[] prices) {

        int after[][] = new int[2][k+1];

        for(int i=prices.length-1;i>=0;i--)
        {
            int curr[][] = new int[2][k+1];
            for(int buy=0;buy<=1;buy++)
            {
                for(int cap=1;cap<=k;cap++)
                {
                    if(buy==1)
                    {
                        curr[buy][cap] = Math.max(-prices[i]+after[0][cap], after[1][cap]);
                    }
                    else
                    {
                        curr[buy][cap] = Math.max(prices[i]+after[1][cap-1], after[0][cap]);
                    }
                }
            }
            after = curr;
        }
        
        return after[1][k];
    }
}