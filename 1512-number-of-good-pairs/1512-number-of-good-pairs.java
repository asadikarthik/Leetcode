class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    map.put(i,j);
                }
            }
        }
        return map.size();
    }
}