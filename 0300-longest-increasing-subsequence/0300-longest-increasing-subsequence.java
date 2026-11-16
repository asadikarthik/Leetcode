
import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {

        int dp[][] = new int[nums.length][nums.length + 1];

        for(int d[] : dp) {
            Arrays.fill(d, Integer.MIN_VALUE);
        }

        return solve(nums, dp, 0, -1);
    }

    public int solve(int nums[], int dp[][], int i, int prev) {

        if(i == nums.length) {
            return 0;
        }

        if(dp[i][prev + 1] != Integer.MIN_VALUE) {
            return dp[i][prev + 1];
        }

        int pick = 0;

        if(prev == -1 || nums[prev] < nums[i]) {
            pick = 1 + solve(nums, dp, i + 1, i);
        }

        int notpick = solve(nums, dp, i + 1, prev);

        return dp[i][prev + 1] = Math.max(pick, notpick);
    }
}
