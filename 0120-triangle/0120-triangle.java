class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        for(int i=0;i<triangle.size();i++)
        {
            for(int j=0;j<triangle.get(i).size();j++)
            {
                if(i==0 && j==0)
                {
                    continue;
                }
                else
                {
                    int up = Integer.MAX_VALUE;
                    int left= Integer.MAX_VALUE;
                    if(j < triangle.get(i - 1).size()) up = triangle.get(i-1).get(j);
                    if(j>0) left = triangle.get(i-1).get(j-1);

                    triangle.get(i).set(j,triangle.get(i).get(j) + Math.min(left,up));
                }
            }
        }

        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < triangle.get(m - 1).size(); j++)
        {
            ans = Math.min(ans, triangle.get(m - 1).get(j));
        }

        return ans ;
    }
}