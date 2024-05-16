package leetcode;

public class L2331EvaluateBooleanBinaryTree {

    public boolean evaluateTree(TreeNode root) {
        return dfs(root) != 0;
    }

    private int dfs(TreeNode cur) {
        if (cur.left == null) return cur.val;

        return (dfs(cur.left) + dfs(cur.right) + 1) / cur.val;
    }

    private class TreeNode {

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
