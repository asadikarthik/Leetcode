class Solution {
    public boolean pali(String s)
    {
        String t="";

        for(int i=s.length()-1;i>=0;i--)
        {
            t+=s.charAt(i);
        }
        if(s.equals(t))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String firstPalindrome(String[] words) {
        
        for(String w:words)
        {
            if(pali(w))
            {
                return w;
            }
        }

        return "";
    }
}