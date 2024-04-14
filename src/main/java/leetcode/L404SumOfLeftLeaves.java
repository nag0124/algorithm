package leetcode;

public class L404SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }

    private int sum(TreeNode node) {
        if (node == null) return 0;

        int sum = 0;
        if (node.left != null && node.left.left == null && node.left.right == null) sum += node.left.val;
        else sum += sum(node.left);
        sum += sum(node.right);

        return sum;
        }
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
