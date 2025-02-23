class Solution {
    public String triangleType(int[] nums) {
        int n =nums[0];
        int m =nums[1];
        int x =nums[2];
        if(n+m<= x || m+x <=n|| n+x <= m){
            return "none";
        }
        else if( n==m &&m==x)
        {
            return "equilateral";
        }
        else if(n==m || m==x || n==x)
        {
            return "isosceles";
        }
        else
        {
            return "scalene";
        }
    }
}