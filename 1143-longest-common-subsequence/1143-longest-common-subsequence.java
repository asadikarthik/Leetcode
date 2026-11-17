class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int n = text1.length();
        int m = text2.length();
        
        int dp[][] = new int[n][m];

        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }
        
        return solve(text1,text2,dp,n-1,m-1);
    }

    public int solve(String text1,String text2,int dp[][], int i,int j)
    {
        if(i<0 || j<0)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(text1.charAt(i)==text2.charAt(j))
        {
            return dp[i][j] = 1 + solve(text1,text2,dp,i-1,j-1);
        }
        
        return dp[i][j] = 0 + Math.max(solve(text1,text2,dp,i-1,j) , solve(text1,text2,dp,i,j-1));
    }
}