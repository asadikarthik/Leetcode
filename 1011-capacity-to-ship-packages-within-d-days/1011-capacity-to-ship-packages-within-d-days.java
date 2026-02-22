class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int i:weights)
        {
            if(i>left)
            {
                left=i;
            }
            right+=i;
        }

        while(left<=right)
        {
            int mid = (left+right)/2;
            if(capacity(weights,mid,days))
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
    public boolean capacity(int[] weights, int c , int days)
    {
        int totaldays=1,count=0;
        for(int i=0;i<weights.length;i++)
        {
            if(count+weights[i]>c)
            {
                totaldays++;
                count=weights[i];
            }
            else
            {
                count+=weights[i];
            }
        }
        if(totaldays<=days)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}