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
    
    // public void inOrder(TreeNode root,List<Integer> l)
    // {
    //     if(root==null)
    //     {
    //         return;
    //     }
    //     inOrder(root.left,l);
    //     l.add(root.val);
    //     inOrder(root.right,l);
    // }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;

        while(true)
        {
            if(node!=null)
            {
                stack.push(node);
                node = node.left;
            }
            else
            {
                if(stack.isEmpty())
                {
                    break;
                }
                node = stack.pop();
                l.add(node.val);
                node = node.right;
            }
        }

        return l;
    }
}