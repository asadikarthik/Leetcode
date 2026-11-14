class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int dp[][] = new int[nums.length][2002];

        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }

        return solve(nums,dp,0,0,target);
    }

    public int solve(int nums[],int dp[][],int i,int sum,int target)
    {
        if(i==nums.length)
        {
            if(sum==target)
            {
                return 1;
            }
            return 0;
        }

        if(dp[i][sum+ 1000]!=-1)
        {
            return dp[i][sum+ 1000];
        }

        int plus = solve(nums,dp,i+1,sum + nums[i],target);
        int minus = solve(nums,dp,i+1,sum - nums[i],target);

        return dp[i][sum+ 1000]=plus+minus;
    }
}