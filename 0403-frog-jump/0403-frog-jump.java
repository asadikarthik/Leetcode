class Solution {
    public boolean canCross(int[] stones) {

        // stone -> possible jump sizes reaching this stone
        Map<Integer, Set<Integer>> dp = new HashMap<>();

        for (int stone : stones) {
            dp.put(stone, new HashSet<>());
        }

        // Start from stone 0 with jump 0
        dp.get(0).add(0);

        for (int stone : stones) {

            for (int jump : dp.get(stone)) {

                // Try jump-1, jump, jump+1
                for (int nextJump = jump - 1;
                     nextJump <= jump + 1;
                     nextJump++) {

                    if (nextJump <= 0) continue;

                    int nextStone = stone + nextJump;

                    // If next stone exists
                    if (dp.containsKey(nextStone)) {

                        dp.get(nextStone).add(nextJump);
                    }
                }
            }
        }

        // If last stone has any reachable jump
        return !dp.get(stones[stones.length - 1]).isEmpty();
    }
}