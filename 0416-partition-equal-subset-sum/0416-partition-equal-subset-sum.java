class Solution {
    public boolean canPartition(int[] nums) {

        int total=0;

        for(int i:nums)
        {
            total+=i;
        }

        int dp[][] = new int[nums.length][total];

        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }

        return solve(nums, dp, 0, 0, total);
    }

    public boolean solve(int[] nums, int dp[][], int i, int sum,int total) {

        if ((total-sum) == sum)
        {   
            return true;
        }

        if (i >= nums.length)
        {
            return false;
        }

        if(dp[i][sum]!=-1)
        {
            return dp[i][sum]==1;
        }

        boolean pick = solve(nums, dp, i + 1, sum + nums[i], total);

        boolean notpick = solve(nums, dp, i + 1, sum, total);

        dp[i][sum]= (pick || notpick)? 1 : 0;


        return dp[i][sum]==1 ;
    }
}
