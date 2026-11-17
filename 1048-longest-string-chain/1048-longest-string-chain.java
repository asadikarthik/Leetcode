class Solution {
    public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        int n = words.length;

        int dp[][] = new int[n][n + 1];

        for(int d[] : dp) {
            Arrays.fill(d, -1);
        }

        return solve(words, dp, 0, -1);
    }

    public int solve(String[] words, int dp[][], int i, int prev) {

        if(i == words.length) {
            return 0;
        }

        if(dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        int pick = 0;

        if(prev == -1 || check(words[prev], words[i])) {
            pick = 1 + solve(words, dp, i + 1, i);
        }

        int notpick = solve(words, dp, i + 1, prev);

        return dp[i][prev + 1] = Math.max(pick, notpick);
    }

    public boolean check(String s1, String s2) {

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