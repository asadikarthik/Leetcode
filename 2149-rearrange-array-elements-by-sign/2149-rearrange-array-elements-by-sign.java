class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                neg.add(nums[i]);
            }
            else
            {
                pos.add(nums[i]);
            }
        }
        int i=0 , j=0;
        
        while(i<nums.length)
        {
            nums[i]=pos.get(j);
            i=i+2;
            j++;
        }

        j=0;
        i=1;
        
        while(i<nums.length)
        {
            nums[i]=neg.get(j);
            i=i+2;
            j++;
        }

        return nums;
    }
}