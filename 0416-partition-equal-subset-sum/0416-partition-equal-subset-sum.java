class Solution {
    public boolean canPartition(int[] nums) {

        int total=0;

        for(int i:nums)
        {
            total+=i;
        }

        if(total % 2 != 0) return false;

        int dp[][] = new int[nums.length+1][total/2+1];

        dp[nums.length][total / 2] = 1;

        for(int i=nums.length-1;i>=0;i--)
        {
            for(int sum=total/2;sum>=0;sum--)
            {
                int pick=0;
                if(sum + nums[i] <= total / 2) {
                    pick = dp[i + 1][sum + nums[i]];
                }


                int notpick = dp[i + 1][sum];

                dp[i][sum] = (pick == 1 || notpick == 1) ? 1 : 0;
            }
        }

        return dp[0][0]==1;
    }
}
