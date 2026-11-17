class Solution {
    public int findNumberOfLIS(int[] nums) {

        int n = nums.length;

        int dp[] = new int[n];
        int count[] = new int[n];

        int maxi = 1;

        for(int i = 0; i < n; i++) {

            dp[i] = 1;
            count[i] = 1;

            for(int j = 0; j < i; j++) {

                if(nums[i] > nums[j] && dp[j] + 1 > dp[i]) {

                    dp[i] = 1 + dp[j];
                    count[i] = count[j];
                }
                else if(nums[i] > nums[j] && dp[j] + 1 == dp[i]) {

                    count[i] += count[j];
                }
            }

            maxi = Math.max(maxi, dp[i]);
        }

        int ans = 0;

        for(int i = 0; i < n; i++) {

            if(dp[i] == maxi) {
                ans += count[i];
            }
        }

        return ans;
    }
}