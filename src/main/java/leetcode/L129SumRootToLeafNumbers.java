package leetcode;

public class L129SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return sum(root, 0);
    }

    private int sum(TreeNode node, int prevSum) {
        int sum = 0;
        int modSum = 10 * prevSum + node.val;

        if (node.left == null && node.right == null) return modSum;
        if (node.left != null) sum += sum(node.left, modSum);
        if (node.right != null) sum += sum(node.right, modSum);
        return sum;
    }

    protected static class TreeNode {

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
