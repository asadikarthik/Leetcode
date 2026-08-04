class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k - 1;

        double sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = sum / k;

        while(right < nums.length-1)
        {
            sum -= nums[left];
            left++;

            right++;
            sum += nums[right];

            max = Math.max(max, sum / k);
        }
        return max;
    }
}