package leetcode;

public class L861ScoreAfterFlippingMatrix {

    public int matrixScore(int[][] grid) {
        int[] cnt = new int[grid[0].length];
        int len = grid.length;
        int answer = 0;

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[i].length; j++) cnt[j] += 1 - grid[i][j];
            } else{
                for (int j = 0; j < grid[i].length; j++) cnt[j] += grid[i][j];
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            answer += Math.max(cnt[i], len - cnt[i]) << (cnt.length - i - 1);
        }
        return answer;
    }

}
