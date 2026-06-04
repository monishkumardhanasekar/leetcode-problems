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
    int max = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;

        treeSum(root);

        return max;

        
    }

    public int treeSum(TreeNode root){
        if(root == null) return 0;

        int lh = Math.max(0, treeSum(root.left));
        int rh = Math.max(0, treeSum(root.right));
        max = Math.max(max, root.val + lh + rh);

        return root.val + Math.max(lh,rh);
    }
}