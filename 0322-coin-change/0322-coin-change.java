import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[] prev = new int[amount + 1];
        int[] cur = new int[amount + 1];

        // Base Case
        for (int t = 0; t <= amount; t++) {
            if (t % coins[0] == 0) {
                prev[t] = t / coins[0];
            } else {
                prev[t] = (int)1e9;
            }
        }

        for (int ind = 1; ind < n; ind++) {

            for (int t = 0; t <= amount; t++) {

                int notTake = prev[t];

                int take = (int)1e9;

                if (coins[ind] <= t) {
                    take = 1 + cur[t - coins[ind]];
                }

                cur[t] = Math.min(take, notTake);
            }

            prev = cur.clone();
        }

        int ans = prev[amount];

        return ans >= 1e9 ? -1 : ans;
    }
}