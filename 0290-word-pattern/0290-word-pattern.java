class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character,String> map =new HashMap<>();
        HashSet<String> wordSet = new HashSet<>();
        String arr[] = s.split(" ");
        if(arr.length!=pattern.length())
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char c =pattern.charAt(i);
            String word=arr[i];
            if(!map.containsKey(c))
            {
                if(wordSet.contains(word))
                {
                    return false;
                }
                map.put(c,arr[i]);
                wordSet.add(word);
            }
            else
            {
                if(map.get(c).equals(arr[i]))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}