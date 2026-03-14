class Solution {
    public String longestPalindrome(String s) {
        
        String longest = "";
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i+1; j <= s.length(); j++)
            {
                String sub = s.substring(i, j);
                if (ispalindromic(sub,0,sub.length()-1) && sub.length() > longest.length())
                {
                    longest = sub;
                }
            }
        }
        return longest;
    }

    public boolean ispalindromic(String s, int l, int r) {

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;

            l++;
            r--;
        }

        return true;
    }
}