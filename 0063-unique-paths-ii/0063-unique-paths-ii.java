class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int i=obstacleGrid.length;
        int j=obstacleGrid[0].length;
        int dp[][] = new int[i][j];
        for (int[] row : dp)
        {
            Arrays.fill(row, -1);
        }

        return solve(obstacleGrid,i-1,j-1,dp);
    }

    public int solve(int arr[][],int i,int j, int dp[][])
    {
        

        if(i<0 ||j<0)
        {
            return 0;
        }

        if(arr[i][j]==1) return 0;

        if(i==0 && j==0)
        {
            return 1;
        }

        if(dp[i][j]!=-1) return dp[i][j];

        int left = solve(arr,i,j-1,dp);
        int up = solve(arr,i-1,j,dp);

        dp[i][j]= left+up;

        return left+up;
    }
}