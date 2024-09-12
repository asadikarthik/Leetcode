class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map =new HashMap<>();
        HashSet<Character> set =new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!map.containsKey(c))
            {
                if(set.contains(t.charAt(i)))
                {
                    return false;
                }
                map.put(c,t.charAt(i));
                set.add(t.charAt(i));
            }
            else
            {
                if(!map.get(c).equals(t.charAt(i)))
                {
                    return false;
                }
            }
        }
        return true;
    }
}