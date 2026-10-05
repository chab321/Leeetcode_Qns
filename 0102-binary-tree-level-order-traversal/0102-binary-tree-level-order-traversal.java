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
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }
        helper(root,0,result);
        return result;

    }
    private void helper(TreeNode root,int level,List<List<Integer>> result){
        if(level == result.size()){
            result.add(new ArrayList<>());
        }
        //add current level node to its
        result.get(level).add(root.val);
        //go to the left side tree
        if(root.left != null){
            helper(root.left,level + 1,result);
        }
        //go to the right side tree
        if(root.right != null){
            helper(root.right,level+1,result);
        }
    }
}