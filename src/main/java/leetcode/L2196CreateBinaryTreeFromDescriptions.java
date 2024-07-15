package leetcode;

public class L2196CreateBinaryTreeFromDescriptions {

    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode[] arr = new TreeNode[100001];
        boolean[] hasParents = new boolean[100001];

        for (int[] description : descriptions) {
            int parent = description[0];
            int child = description[1];
            boolean isLeft = description[2] == 1;

            if (arr[parent] == null) arr[parent] = new TreeNode(parent);
            if (arr[child] == null) arr[child] = new TreeNode(child);

            if (isLeft) arr[parent].left = arr[child];
            else arr[parent].right = arr[child];

            hasParents[child] = true;
        }

        for (int[] description : descriptions) {
            if (!hasParents[description[0]]) return arr[description[0]];
        }
        return null;
    }

    public class TreeNode {

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
