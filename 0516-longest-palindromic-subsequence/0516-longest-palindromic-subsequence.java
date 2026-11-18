
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];

        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }

        return solve(s, dp, 0, n-1);
    }

    public int solve(String s, int dp[][], int i, int j) {
        if(i > j) return 0;

        if(i == j) return 1;

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        if(s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = 2 + solve(s, dp, i+1, j-1);
        }

        return dp[i][j] = Math.max(
            solve(s, dp, i+1, j),
            solve(s, dp, i, j-1)
        );
    }
}
