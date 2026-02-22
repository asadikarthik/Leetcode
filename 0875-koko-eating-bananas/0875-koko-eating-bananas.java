class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i : piles)
        {
            if (max < i)
            {
                max = i;
            }
        }
        int left = 1; 
        int right = max;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            long totalHours = findth(piles, mid);
            if (totalHours <= h)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return left;
    }

    public long findth(int[] piles, int k)
    {
        long total = 0;
        for (int i : piles)
        {
            total += (long) Math.ceil((double) i / k);
        }
        return total;
    }
}
