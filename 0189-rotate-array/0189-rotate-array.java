class Solution {
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        k=k% nums.length;
        for(int i=0;i<nums.length;i++)
        {
            //System.out.println(x);
            arr[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }

    }
}