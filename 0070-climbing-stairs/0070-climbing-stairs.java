class Solution {

    public int climbStairs(int n)
    {
        int prev1=1,prev2=1;
        int x=0;
        for(int i=2;i<=n;i++)
        {
            x = prev1+prev2;
            prev2=prev1;
            prev1=x;
        }
        return prev1;
    }
}