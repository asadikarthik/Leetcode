class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max=0,count=0;
        for(int i : map.keySet())
        {
            if(map.get(i)==i)
            {
                max=Math.max(max,i);
                count++;
                //return i;
            }
        }
        if(count>0) return max;
        return -1;
    }
}