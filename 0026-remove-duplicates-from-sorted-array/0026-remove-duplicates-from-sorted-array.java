class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            map.putIfAbsent(nums[i],0);
            
        }
        List<Integer> al = new ArrayList<>(map.keySet());
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
        {
            nums[j++]=al.get(i);
        }
        return j;
    }
}