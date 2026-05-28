class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return house(nums.length-1,nums,dp);
    }

    public int house(int n,int[] nums,int[] dp)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return nums[0];
        }

        if(dp[n]!=-1)
        {
            return dp[n];
        }

        int pick = nums[n] + house(n-2,nums,dp);
        int notpick = 0 + house(n-1,nums,dp);
        return dp[n]= Math.max(pick,notpick);
    }
}