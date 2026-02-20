class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;

        int low = 0;
        int high = matrix.length*matrix[0].length-1;
        
        int m = matrix[0].length;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int l = mid/m;
            int r = mid%m;
            if(matrix[l][r]==target)
            {
                return true;
            }
            else if(matrix[l][r]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
}