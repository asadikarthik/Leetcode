class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int sum = 0;

        // Take first k elements
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        max = sum;

        // Slide window: remove from front, add from end
        for (int i = k - 1, j = cardPoints.length - 1; i >= 0; i--, j--) {
            sum = sum - cardPoints[i] + cardPoints[j];
            max = Math.max(max, sum);
        }

        return max;
    }
}