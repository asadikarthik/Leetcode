class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {

        int n = nums.length;
        List<Integer>[][] dp = new ArrayList[n][n + 1];
        Arrays.sort(nums);

        return solve(nums,dp, 0, -1);
    }

    public List<Integer> solve(int nums[], List<Integer>[][] dp, int i, int prev) {

        if(i == nums.length) {
            return new ArrayList<>();
        }

        if(dp[i][prev + 1] != null)
        {
            return new ArrayList<>(dp[i][prev + 1]);
        }

        List<Integer> pick = new ArrayList<>();

        if(prev == -1 || nums[i] % nums[prev] == 0) {

            pick = solve(nums,dp, i + 1, i);
            pick.add(0, nums[i]);
        }

        // Not pick
        List<Integer> notpick = solve(nums,dp, i + 1, prev);

        List<Integer> ans;

        if(pick.size() >= notpick.size())
        {
            ans = pick;
        }
        else
        {
            ans = notpick;
        }

        dp[i][prev + 1] = new ArrayList<>(ans);

        return new ArrayList<>(dp[i][prev + 1]);
    }
}