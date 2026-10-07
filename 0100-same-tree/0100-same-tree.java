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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
          return Helper(p,q);
    }
    public boolean Helper(TreeNode p, TreeNode q) {
        //if both root is null then return true
        if(p == null && q == null) return true;
        //if both root is not null return flase
        if(p == null || q == null) return false;
        //if val not equal to same return false
        if(p.val != q.val) return false;

        return Helper(p.left,q.left) && Helper(p.right,q.right);

    }
}