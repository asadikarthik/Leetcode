
import java.util.*;

class Solution {
    public int lengthOfLIS(int[] nums) {

        int n = nums.length;

        int dp[][] = new int[n + 1][n + 1];

        for(int i = n - 1; i >= 0; i--) {

            for(int prev = i - 1; prev >= -1; prev--) {

                int pick = 0;

                if(prev == -1 || nums[prev] < nums[i]) {
                    pick = 1 + dp[i + 1][i + 1];
                }

                int notpick = dp[i + 1][prev + 1];

                dp[i][prev + 1] = Math.max(pick, notpick);
            }
        }

        return dp[0][0];
    }
}
