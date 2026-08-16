class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int res[] = new int[n];

        Stack<Integer> s = new Stack<>();

        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i])
            {
                int j= s.pop();
                res[j]=i-j;
            }
            
            s.push(i);
        }

        return res;
    }
}