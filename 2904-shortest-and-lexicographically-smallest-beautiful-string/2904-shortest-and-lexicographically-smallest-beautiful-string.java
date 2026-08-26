class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1') {
                count++;
            }

            while (count > k) {
                if (s.charAt(left) == '1') {
                    count--;
                }
                left++;
            }

            if (count == k) {

                // Remove unnecessary leading zeros
                while (s.charAt(left) == '0') {
                    left++;
                }

                int len = right - left + 1;
                String curr = s.substring(left, right + 1);

                if (len < min || (len == min && curr.compareTo(ans) < 0)) {
                    min = len;
                    ans = curr;
                }
            }
        }

        return ans;
    }
}