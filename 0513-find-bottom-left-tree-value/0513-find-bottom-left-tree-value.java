class Solution {
    
    int maxLevel;
    int result;
    
    public int findBottomLeftValue(TreeNode root) {
        maxLevel = -1;   // ✅ important
        result = 0;
        
        dfs(root, 0);
        return result;
    }
    
    private void dfs(TreeNode node, int level) {
        if (node == null) return;
        
        // ✅ first node at this level
        if (level > maxLevel) {
            maxLevel = level;
            result = node.val;
        }
        
        // 🔥 LEFT FIRST (very important)
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}