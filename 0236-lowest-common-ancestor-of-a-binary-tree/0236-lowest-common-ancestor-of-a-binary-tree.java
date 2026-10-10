/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Helper(root,p,q);
        return ans;
    }
    private int Helper(TreeNode root,TreeNode p,TreeNode q){
        if(root == null) return 0;
        int left = Helper(root.left,p,q);
        int right = Helper(root.right,p,q);
        int self = 0;
        if(root == p || root ==q) {
            self = 1;
        }
        int total = left + self + right;
        if(total == 2 && ans == null) {
            ans = root;
        }
        return total;
    }
}