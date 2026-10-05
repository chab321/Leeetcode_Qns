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
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Helper(root,0,levels); 
        for(List<Integer> level : levels){
            int max = Integer.MIN_VALUE;
            for(int val : level){
               max = Math.max(max,val);
            }
            result.add(max);
        }
        return result;
    }
    private void Helper(TreeNode root,int level,List<List<Integer>> levels ){
        if(root == null) return;
        if(level == levels.size()){
          levels.add(new ArrayList<>());
        }

        //Add value to current level
        levels.get(level).add(root.val);
        
        // Go to next level
        if (root.left != null) {
            Helper(root.left, level + 1, levels);
        }

        if (root.right != null) {
            Helper(root.right, level + 1, levels);
    }
    }
}