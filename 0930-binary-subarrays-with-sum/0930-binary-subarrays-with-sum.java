class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return subArray(nums,goal)-subArray(nums,goal-1);
    }

    public int subArray(int[] nums, int goal)
    {
        if (goal < 0) return 0;
        int left=0 , count=0 , sum=0;
        for(int right = 0; right < nums.length; right++)
        {
            sum+=nums[right];

            while(sum>goal)
            {
                sum -= nums[left];
                left++;
            }

            count = count + right-left+1;
        }
        System.out.println(count);
        return count;
    }
}