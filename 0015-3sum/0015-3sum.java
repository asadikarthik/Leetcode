class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //List<>> al = new ArrayList<>();
        HashSet<List<Integer>> s = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i;j<nums.length;j++)
            {
                if(i!=j)
                {
                    int x = 0 - (nums[i]+nums[j]);
                    if(map.containsKey(x))
                    {
                        List<Integer> al2 = Arrays.asList(nums[i],x,nums[j]);
                        Collections.sort(al2);
                        s.add(al2);
                    }
                    else
                    {
                        map.put(nums[j],j);
                    }
                }
            }
        }

        

        return new ArrayList<>(s);
       
        // Set<List<Integer>> resultSet = new HashSet<>();
        // int n = nums.length;

        // for (int i = 0; i < n - 2; i++) {
        //     Set<Integer> seen = new HashSet<>();
        //     for (int j = i + 1; j < n; j++)
        //     {
        //         int x = 0 - (nums[i] + nums[j]);
        //         if (seen.contains(x))
        //         {
        //             List<Integer> triplet = Arrays.asList(nums[i], nums[j], x);
        //             Collections.sort(triplet); 
        //             resultSet.add(triplet);
        //         }
        //         else{
        //             seen.add(nums[j]);
        //         }
        //     }
        // }

        // return new ArrayList<>(resultSet);
    }
}