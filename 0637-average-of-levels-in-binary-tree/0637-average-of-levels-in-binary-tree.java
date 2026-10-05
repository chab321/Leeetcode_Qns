class Solution {
    public List<Double> averageOfLevels(TreeNode root) {

        List<List<Integer>> levels = new ArrayList<>();

        helper(root, 0, levels);

        List<Double> result = new ArrayList<>();

        // Calculate average of every level
        for (List<Integer> level : levels) {
            double sum = 0;

            for (int value : level) {
                sum += value;
            }

            result.add(sum / level.size());
        }

        return result;
    }

    private void helper(TreeNode root, int level,
                         List<List<Integer>> levels) {

        if (root == null) {
            return;
        }

        // Create new level
        if (level == levels.size()) {
            levels.add(new ArrayList<>());
        }

        // Add value to current level
        levels.get(level).add(root.val);

        // Go to next level
        if (root.left != null) {
            helper(root.left, level + 1, levels);
        }

        if (root.right != null) {
            helper(root.right, level + 1, levels);
        }
    }
}