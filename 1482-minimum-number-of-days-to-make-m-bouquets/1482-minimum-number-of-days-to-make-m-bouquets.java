class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)
        {
            return -1;
        }

        int left = Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;

        for(int i:bloomDay)
        {
            if(i<left)
            {
                left=i;
            }
            if(i>right)
            {
                right=i;
            }
        }

        while(left<=right)
        {
            int mid = (left+right)/2;
            if(possible(bloomDay, mid,m,k))
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
    }

    public boolean possible(int[] arr,int days, int m, int k)
    {
        int count=0;
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=days)
            {
                count++;
            }
            else
            {
                total+=count/k;
                count=0;
            }
        }
        total+=count/k;
        if(total>=m)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 
}