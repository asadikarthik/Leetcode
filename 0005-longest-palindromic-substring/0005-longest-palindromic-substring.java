class Solution {
    public String longestPalindrome(String s) {

        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                if (isPalindrome(s, i, j - 1) && j - i > longest.length()) {
                    longest = s.substring(i, j);
                }
            }
        }

        return longest;
    }

    public boolean isPalindrome(String s, int l, int r) {

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;

            l++;
            r--;
        }

        return true;
    }
}
