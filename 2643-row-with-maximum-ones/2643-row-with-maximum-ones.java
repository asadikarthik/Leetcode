class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[]= new int[2];
        int max=0;

        for(int i=0;i<mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[0].length;j++)
            {
                sum+=mat[i][j];
            }
            if(sum>max)
            {
                max=sum;
                arr[0]=i;
                arr[1]=max;
            }
        }
        return arr;
    }
}