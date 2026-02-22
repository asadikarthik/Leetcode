class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for(int i:nums)
        {
            if(i>right)
            {
                right=i;
            }
        }
        int ans=Integer.MAX_VALUE;
        while(left<=right)
        {
            int mid =(left+right)/2;
            if(possible(nums,mid, threshold))
            {
                ans = Math.min(ans,mid);
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        
        return ans;
    }

    public boolean possible(int[] nums,int mid, int threshold)
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            // double x = (double)nums[i]/mid;
            // System.out.println(x);
            sum+= Math.ceil((double)nums[i]/mid);
        }
        if(sum<=threshold)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}