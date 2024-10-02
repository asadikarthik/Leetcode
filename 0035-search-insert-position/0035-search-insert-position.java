class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
            else if(target>nums[i] && target<nums[i+1])
            {
                return i+1;
            }
            // else if(target>nums[i] && target>nums[i+1] &&target!=nums[i])
            // {
            //     return nums.length;
            // }
        }
        if(nums[nums.length-1]<target)
        {
            return nums.length;
        }
        else if(nums[0]>target)
        {
            return 0;
        }
        if(nums.length ==1 && nums[0] == target)
        {
            return 0;
        }
        
        return -1;
    }
}