class Solution {

    public boolean isMirror(TreeNode left, TreeNode right) {
        // both null
        if (left == null && right == null) return true;

        // one null
        if (left == null || right == null) return false;

        // values must match
        if (left.val != right.val) return false;

        // mirror check (cross)
        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return isMirror(root.left, root.right);
    }
}