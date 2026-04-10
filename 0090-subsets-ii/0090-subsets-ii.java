import java.util.*;

class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // 🔥 required
        solve(0, nums, new ArrayList<>(), result);
        return result;
    }
    
    public void solve(int i, int[] nums, List<Integer> curr, List<List<Integer>> result) {
        
        // ✅ add current subset
        result.add(new ArrayList<>(curr));
        
        for (int j = i; j < nums.length; j++) {
            
            // 🔥 skip duplicates at same level
            if (j > i && nums[j] == nums[j - 1]) continue;
            
            // pick
            curr.add(nums[j]);
            solve(j + 1, nums, curr, result);
            
            // backtrack
            curr.remove(curr.size() - 1);
        }
    }
}