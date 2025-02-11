class Solution {
    public int findLucky(int[] arr) {
        int nums[] = new int[501];
                                        
        for(int i:arr)
        {
            nums[i]++;
        }

        for(int i=500;i>=1;i--)
        {
            if(i==nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}