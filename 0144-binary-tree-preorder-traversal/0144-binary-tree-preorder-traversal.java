/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void preOrder(TreeNode root, List<Integer> l)
    {
        if(root == null)
        {
            return;
        }
        l.add(root.val);
        preOrder(root.left ,l);
        preOrder(root.right,l);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        preOrder(root,l);
        return l;
    }
}