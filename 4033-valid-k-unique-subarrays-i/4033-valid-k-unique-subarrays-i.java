import java.util.*;

class Solution {

    static class Query {
        int l, r, idx;

        Query(int l, int r, int idx) {
            this.l = l;
            this.r = r;
            this.idx = idx;
        }
    }

    public boolean[] validSubarrays(int[] nums, int k, int[][] queries) {

        int n = nums.length;
        int q = queries.length;

        boolean[] ans = new boolean[q];

        // Size of each block
        int block = (int) Math.sqrt(n) + 1;

        Query[] qs = new Query[q];

        for (int i = 0; i < q; i++) {
            qs[i] = new Query(
                queries[i][0],
                queries[i][1],
                i
            );
        }

        // Sort queries according to Mo's ordering
        Arrays.sort(qs, (a, b) -> {

            int blockA = a.l / block;
            int blockB = b.l / block;

            if (blockA != blockB) {
                return Integer.compare(blockA, blockB);
            }

            // Alternate R direction to reduce movement
            if (blockA % 2 == 0) {
                return Integer.compare(a.r, b.r);
            } else {
                return Integer.compare(b.r, a.r);
            }
        });

        // nums[i] <= 100000
        int[] freq = new int[100001];

        int left = 0;
        int right = -1;

        int distinct = 0;
        int odd = 0;

        for (Query query : qs) {

            int L = query.l;
            int R = query.r;

            // Expand left
            while (left > L) {
                left--;
                int x = nums[left];

                if (freq[x] == 0) {
                    distinct++;
                }

                if (freq[x] % 2 == 0) {
                    odd++;
                } else {
                    odd--;
                }

                freq[x]++;
            }

            // Expand right
            while (right < R) {
                right++;
                int x = nums[right];

                if (freq[x] == 0) {
                    distinct++;
                }

                if (freq[x] % 2 == 0) {
                    odd++;
                } else {
                    odd--;
                }

                freq[x]++;
            }

            // Remove from left
            while (left < L) {
                int x = nums[left];

                if (freq[x] % 2 == 1) {
                    odd--;
                } else {
                    odd++;
                }

                freq[x]--;

                if (freq[x] == 0) {
                    distinct--;
                }

                left++;
            }

            // Remove from right
            while (right > R) {
                int x = nums[right];

                if (freq[x] % 2 == 1) {
                    odd--;
                } else {
                    odd++;
                }

                freq[x]--;

                if (freq[x] == 0) {
                    distinct--;
                }

                right--;
            }

            // Answer current query
            ans[query.idx] = (distinct == k && odd == 0);
        }

        return ans;
    }
}