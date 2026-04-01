class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return subwithDistinct(nums,k)-subwithDistinct(nums,k-1);
    }

    public int subwithDistinct(int[] nums, int k)
    {
        int left=0 , count=0 ;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right=0;right<nums.length;right++)
        {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while(map.size()>k)
            {
                map.put(nums[left], map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])==0)
                {
                    map.remove(nums[left]);
                }
                left++;

            }
            count += (right - left + 1);
        }
        return count;
    }
}