
class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][][] arr = new int[m][n][n];

        // Initialize all states as unreachable
        for (int i = 0; i < m; i++) {
            for (int j1 = 0; j1 < n; j1++) {
                Arrays.fill(arr[i][j1], Integer.MIN_VALUE);
            }
        }

        // Base case: Robot 1 starts at column 0,
        // Robot 2 starts at column n - 1
        arr[0][0][n - 1] = grid[0][0] + grid[0][n - 1];

        for (int i = 1; i < m; i++) {
            for (int j1 = 0; j1 < n; j1++) {
                for (int j2 = 0; j2 < n; j2++) {

                    int max = Integer.MIN_VALUE;

                    for (int d1 = -1; d1 <= 1; d1++) {
                        for (int d2 = -1; d2 <= 1; d2++) {

                            int prev1 = j1 - d1;
                            int prev2 = j2 - d2;

                            if (prev1 >= 0 && prev1 < n &&
                                prev2 >= 0 && prev2 < n &&
                                arr[i - 1][prev1][prev2] != Integer.MIN_VALUE) {

                                max = Math.max(
                                    max,
                                    arr[i - 1][prev1][prev2]
                                );
                            }
                        }
                    }

                    if (max == Integer.MIN_VALUE) {
                        continue;
                    }

                    int cherries = grid[i][j1];

                    if (j1 != j2) {
                        cherries += grid[i][j2];
                    }

                    arr[i][j1][j2] = max + cherries;
                }
            }
        }

        int ans = Integer.MIN_VALUE;

        for (int j1 = 0; j1 < n; j1++) {
            for (int j2 = 0; j2 < n; j2++) {
                ans = Math.max(ans, arr[m - 1][j1][j2]);
            }
        }

        return ans;
    }
}
