class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        subS(0,nums,l,ll);
        return ll;
    }
    public void subS(int i,int[] nums , List<Integer> l , List<List<Integer>> ll)
    {
        if(i>=nums.length)
        {
            ll.add(new ArrayList<>(l));
            return;
        }

        //pick
        l.add(nums[i]);
        subS(i+1,nums,l,ll);
        l.remove(l.size()-1);

        //not pick
        subS(i+1,nums,l,ll);
    }
}