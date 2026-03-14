class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int a[]= new int[2];
        int n = mat.length;
        int m =mat[0].length;
        int low =0,high=m-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            int maxele = maxElement(mat,n,mid);
            int left = mid-1>=0? mat[maxele][mid-1] : -1;
            int right = mid+1<m? mat[maxele][mid+1] : -1;
            
            if(mat[maxele][mid]>left && mat[maxele][mid]>right)
            {
                a[0]=maxele;
                a[1]=mid;
                return a;
            }
            else if(mat[maxele][mid]<left)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return a;
    }

    public int maxElement(int[][] mat,int n,int mid)
    {
        int max=-1;
        int maxindex=-1;
        for(int i=0;i<n;i++)
        {
            if(mat[i][mid ]> max)
            {
                max=mat[i][mid];
                maxindex = i;
            }
        }
        return maxindex;
    }
}