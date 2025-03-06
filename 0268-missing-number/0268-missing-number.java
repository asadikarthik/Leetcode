class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0)
        {
            return 0;
        }
        if(nums[nums.length-1]!=nums.length)
        {
            return nums.length;
        }
        else
        {
            for(int i=0; i<nums.length-1;i++)
            {
                if(nums[i]+1==nums[i+1])
                {
                    continue;
                }
                else
                {
                    return nums[i]+1;
                }
            }
        }
        return 1;
    }
}