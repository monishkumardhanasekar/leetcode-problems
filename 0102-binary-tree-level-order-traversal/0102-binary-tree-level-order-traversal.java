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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if (root == null) return res; 

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0)); 

        while(!q.isEmpty()){
            Pair curr = q.poll();
            TreeNode node = curr.node;
            int level = curr.level;

            if (res.size() == level) 
            {
                res.add(new ArrayList<>());
            }

            res.get(level).add(node.val);

            if (node.left != null) {
                q.add(new Pair(node.left, level + 1));
            }

            if (node.right != null) {
                q.add(new Pair(node.right, level + 1));
            }
        }

        return res;
        
    }
}

class Pair {
    TreeNode node;
    int level;

    Pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}