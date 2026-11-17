class Solution
{
    public int longestStrChain(String[] words)
    {

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        int n = words.length;

        int dp[] = new int[n + 1];

        for(int i=n-1;i>=0;i--)
        {
            for(int prev = i - 1; prev >= -1;prev--)
            {
                int pick = 0;

                if(prev == -1 || check(words[prev], words[i]))
                {
                    pick = 1 + dp[i + 1];
                }

                int notpick = dp[prev + 1];

                dp[prev + 1] = Math.max(pick, notpick); 
            }
        }

        return dp[0];
    }

    public boolean check(String s1, String s2)
    {

        if(s2.length() != s1.length() + 1) {
            return false;
        }

        int i = 0;
        int j = 0;

        while(i < s1.length() && j < s2.length()) {

            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s1.length();
    }
}