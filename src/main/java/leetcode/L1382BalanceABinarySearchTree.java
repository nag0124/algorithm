package leetcode;

public class L1382BalanceABinarySearchTree {

    public TreeNode balanceBST(TreeNode root) {
        int len = count(root);
        int[] vals = new int[len];

        bfs(vals, root, 0);
        return create(vals, 0, len - 1);
    }

    private int count(TreeNode cur) {
        if (cur == null) return 0;

        return count(cur.left) + count(cur.right) + 1;
    }

    private int bfs(int[] vals, TreeNode cur, int i) {
        if (cur == null) return i;

        i = bfs(vals, cur.left, i);
        vals[i++] = cur.val;
        return bfs(vals, cur.right, i);
    }

    private TreeNode create(int[] vals, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(vals[mid]);
        TreeNode left = create(vals, start, mid - 1);
        TreeNode right = create(vals, mid + 1, end);
        root.left = left;
        root.right = right;

        return root;
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
