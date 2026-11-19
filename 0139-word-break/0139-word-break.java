
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Boolean dp[] = new Boolean[s.length()];

        return solve(s, wordDict, dp, 0);
    }

    public boolean solve(String s, List<String> wordDict, Boolean dp[], int i)
    {
        if(i == s.length()) return true;

        if(dp[i] != null)
        {
            return dp[i];
        }

        for(int j = i; j < s.length(); j++)
        {
            String sub = s.substring(i, j+1);

            if(wordDict.contains(sub))
            {
                if(solve(s, wordDict, dp, j+1))
                {
                    return dp[i] = true;
                }
            }
        }

        return dp[i] = false;
    }
}
