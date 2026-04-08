import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // 🔥 VERY IMPORTANT
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] arr, int target,
                           List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            // 🔥 Skip duplicates
            if (i > start && arr[i] == arr[i - 1]) continue;

            if (arr[i] > target) break; // optimization

            current.add(arr[i]);

            // move forward (no reuse)
            backtrack(i + 1, arr, target - arr[i], current, result);

            current.remove(current.size() - 1); // backtrack
        }
    }
}