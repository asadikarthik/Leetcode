class Solution {
    public int removeDuplicates(int[] nums){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=0;
        }
        int j=0,count=0;
        ArrayList<Integer> al = new ArrayList<>(map.keySet());
        Collections.sort(al);
        for(int i:al)
        {
            nums[j++]=i;
            count++;
        }

        return count;
    }
}