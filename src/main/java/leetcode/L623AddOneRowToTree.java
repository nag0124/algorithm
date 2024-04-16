package leetcode;

public class L623AddOneRowToTree {

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) return new TreeNode(val, root, null);

        insert(root, val, depth);
        return root;
    }

    private void insert(TreeNode cur, int val, int depth) {
        if (cur == null) return;

        if (depth == 2) {
            TreeNode left = new TreeNode(val, cur.left, null);
            TreeNode right = new TreeNode(val, null, cur.right);
            cur.left = left;
            cur.right = right;
            return;
        }

        depth--;
        insert(cur.left, val, depth);
        insert(cur.right, val, depth);
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
