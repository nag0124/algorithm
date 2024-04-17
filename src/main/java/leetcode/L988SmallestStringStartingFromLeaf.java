package leetcode;

public class L988SmallestStringStartingFromLeaf {

    String answer = "";

    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        search(root, sb);
        return answer;
    }

    private void search(TreeNode cur, StringBuilder sb) {
        if (cur == null) return;

        sb.insert(0, (char) ('a' + cur.val));
        if (cur.left == null && cur.right == null) answer = (answer.isEmpty() || answer.compareTo(sb.toString()) > 0) ? sb.toString() : answer;
        else {
            search(cur.left, sb);
            search(cur.right, sb);
        }
        sb.deleteCharAt(0);
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
