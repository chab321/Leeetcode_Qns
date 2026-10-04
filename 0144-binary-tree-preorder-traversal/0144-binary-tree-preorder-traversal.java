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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> ans = new ArrayList<>();
       helper(root,ans);
       return ans;
    }
    private void helper(TreeNode Node,List<Integer> result) {
        if(Node == null) return;
        result.add(Node.val);
        helper(Node.left,result);
        helper(Node .right,result);
    }
}