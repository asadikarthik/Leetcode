class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0,j=0;
        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                arr[j++]=nums[i];
                c++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=arr[i];
        }
        return c;
    }
}