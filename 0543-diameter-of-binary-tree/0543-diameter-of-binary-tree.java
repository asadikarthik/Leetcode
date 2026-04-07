class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        // update diameter
        diameter = Math.max(diameter, left + right);

        // return height
        return Math.max(left, right) + 1;
    }
}