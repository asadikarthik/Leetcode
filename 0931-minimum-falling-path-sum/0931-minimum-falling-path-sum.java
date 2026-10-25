
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {

                if (i == 0)
                {
                    dp[i][j] = matrix[i][j];
                }
                else
                {
                    int left = Integer.MAX_VALUE;
                    int up = dp[i - 1][j];
                    int right = Integer.MAX_VALUE;

                    if (j > 0)
                    {
                        left = dp[i - 1][j - 1];
                    }

                    if (j < n - 1)
                    {
                        right = dp[i - 1][j + 1];
                    }

                    dp[i][j] = matrix[i][j]
                            + Math.min(left, Math.min(up, right));
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++)
        {
            ans = Math.min(ans, dp[m - 1][j]);
        }

        return ans;
    }
}
