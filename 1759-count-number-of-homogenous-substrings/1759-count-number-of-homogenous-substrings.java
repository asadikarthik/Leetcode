class Solution {
    public int countHomogenous(String s) {
        int mod = 1000000007;
        long sum = 0;
        long count = 0; // length of current consecutive characters

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
            sum = (sum + count) % mod;
        }

        return (int) sum;
    }
}
