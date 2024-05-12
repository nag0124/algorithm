package leetcode;

public class L2373LargestLocalValuesInAMatrix {

    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int [][] max = new int[len - 2][len - 2];

        for (int i = 0; i < len - 2; i++) {
            for (int j = 0; j < len - 2; j++) {
                int lm = 0;

                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        lm = Math.max(lm, grid[k][l]);
                    }
                }
                max[i][j] = lm;
            }
        }
        return max;
    }

}
