class Solution {
    public int longestStrChain(String[] words) {

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        int n = words.length;

        int next[] = new int[n + 1];
        int curr[] = new int[n + 1];

        for(int i = n - 1; i >= 0; i--) {

            for(int prev = i - 1; prev >= -1; prev--) {

                int pick = 0;

                if(prev == -1 || check(words[prev], words[i])) {
                    pick = 1 + next[i + 1];
                }

                int notpick = next[prev + 1];

                curr[prev + 1] = Math.max(pick, notpick);
            }

            next = curr;
        }

        return next[0];
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