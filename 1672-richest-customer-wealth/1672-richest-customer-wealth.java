class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=-1;

        for(int i=0;i<accounts.length;i++)
        {
            int count=0;
            for(int j=0;j<accounts[0].length;j++)
            {
                count+=accounts[i][j];
            }
            max = Math.max(count,max);
        }
        return max;
    }
}