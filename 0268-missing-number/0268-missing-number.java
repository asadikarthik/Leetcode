class Solution {
    public int missingNumber(int[] nums) {
        boolean arr[]=new boolean[nums.length+1];

        for(int i=0;i<nums.length;i++)
        {
            arr[nums[i]]=true;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i])
            {
                return i;
            }
        }
        return 0;
    }
}