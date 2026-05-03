class Solution {
    int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    
    private int dfs(TreeNode root) {
        if (root == null) return 0;
        
        int left = Math.max(0, dfs(root.left));   
        int right = Math.max(0, dfs(root.right));
        
        // path THROUGH node
        int currentPath = left + right + root.val;
        
        maxSum = Math.max(maxSum, currentPath);
        
        // return path to parent (only one side)
        return root.val + Math.max(left, right);
    }
}