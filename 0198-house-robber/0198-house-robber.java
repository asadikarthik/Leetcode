class Solution {
    public int rob(int[] nums) {
        int prev2 =0;
        int prev1 =nums[0];
        int n =nums.length;

        for(int i=1;i<n;i++)
        {
            int pick = nums[i];
            if (i > 1)
                pick += prev2;
            int notpick = 0 + prev1;
            int curr = Math.max(pick,notpick);
            prev2= prev1;
            prev1 = curr;
        }

        return prev1;
    }
}