class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:map.keySet())
        {
            if(map.get(i)>=2)
            {
                map.put(i,2);
                al.add(i);
                al.add(i);
            }
            else
            {
                al.add(i);
            }
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
        {
            nums[i]=al.get(i);
        }
        return al.size();
    }
}