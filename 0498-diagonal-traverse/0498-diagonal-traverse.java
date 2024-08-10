class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m=mat.length,n=mat[0].length;
        int idx=0;
        int arr[]=new int[m*n];
        int row=0,col=0;
        boolean up=true;

        while(row<m && col<n)
        {
            if(up)
            {
                while(row>0 && col<n-1)
                {
                    arr[idx++]=mat[row][col];
                    row--;
                    col++;
                }
                arr[idx++]=mat[row][col];
                if(col==n-1)
                {
                    row++;
                }
                else
                {
                    col++;
                }
            }
            else
            {
                while(row<m-1 && col>0)
                {
                    arr[idx++]=mat[row][col];
                    col--;
                    row++;
                }
                arr[idx++]=mat[row][col];
                if(row==m-1)
                {
                    col++;
                }
                else
                {
                    row++;
                }
            }
            up=!up;
        }
        return arr;
    }
}