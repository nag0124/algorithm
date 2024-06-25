package leetcode;

public class L1038BinarySearchTreeToGreaterSumTree {

    public TreeNode bstToGst(TreeNode root) {
        search(root, 0);
        return root;
    }

    private int search(TreeNode cur, int sum) {
        if (cur.left == null && cur.right == null) {
            cur.val += sum;
            return cur.val;
        }

        if (cur.right != null) sum = search(cur.right, sum);
        cur.val += sum;
        sum = cur.val;
        if (cur.left != null) sum = search(cur.left, sum);
        return sum;
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
