package leetcode;

public class L1325DeleteLeavesWithAGivenValue {

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        dfs(root, target);
        return dfs(root, target) ? null : root;
    }

    private boolean dfs(TreeNode cur, int target) {
        if (cur.left != null && dfs(cur.left, target)) cur.left = null;
        if (cur.right != null && dfs(cur.right, target)) cur.right = null;
        return cur.left == null && cur.right == null && cur.val == target;
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}
