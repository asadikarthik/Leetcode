class Solution {
    public int distributeCandies(int[] candyType) {
        int diff=0;
        Set<Integer> set = new HashSet<>();

        for(int i:candyType)
        {
            set.add(i);
        }
        int n= candyType.length/2;

        if(set.size()>n)
        {
            return n;
        }
        else if(set.size()==n)
        {
            return n;
        }
        else
        {
            return set.size();
        }
    }
}