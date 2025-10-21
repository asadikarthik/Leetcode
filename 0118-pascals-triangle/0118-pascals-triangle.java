class Solution {
    public List<Integer> gen(int row)
    {
        int ans=1;
        List<Integer> l = new ArrayList<>();
        l.add(1); 
        for(int i=1;i<row;i++)
        {
            ans=ans*(row-i);
            ans=ans/i;
            l.add(ans);
        }
        return l;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new ArrayList<>();

        for(int i=1;i<=numRows;i++)
        {
            ll.add(gen(i));
        }

        return ll;
    }
}