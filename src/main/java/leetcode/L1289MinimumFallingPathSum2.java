package leetcode;

public class L1289MinimumFallingPathSum2 {

    public int minFallingPathSum(int[][] grid) {
        int len = grid.length;
        if (len == 1) return grid[0][0];

        int[] cur = new int[len];
        int[] bf;
        int answer = Integer.MAX_VALUE;

        for (int row = 0; row < len; row++) {
            bf = cur;
            cur = new int[len];

            for (int col = 0; col < len; col++) {
                int min = Integer.MAX_VALUE;

                for (int i = 0; i < len; i++) {
                    if (i == col) continue;
                    min = Math.min(bf[i], min);
                }
                cur[col] = min + grid[row][col];
            }
        }

        for (int i : cur) {
            answer = Math.min(answer, i);
        }
        return answer;
    }

}
