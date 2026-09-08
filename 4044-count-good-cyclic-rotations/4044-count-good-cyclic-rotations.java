class Solution {
    public int countGoodRotations(int[] nums) {

        int n = nums.length;
        long total=0;

        for(int i=0;i<n;i++)
        {
            total+=nums[i];
        }

        int[] peldarquin = nums;
        long first = sum(nums, 0, n / 2);
        int count=0;
        
        for(int i=0;i<nums.length;i++)
        {   
            if(first>total-first)
            {
                count++;
            }

            first-=nums[i];
            first+=nums[(i+n/2)%n];
        }

        return count;
    }

    public long sum(int[] nums,int start, int end)
    {
        long total=0;

        for(int i=start;i<end;i++)
        {
            total+=nums[i];
        }
        return total;
    }
}