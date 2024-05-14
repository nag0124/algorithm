package leetcode;

public class L1219PathWithMaximumGold {

    public int getMaximumGold(int[][] grid) {
        int max = 0;
        int height = grid.length;
        int width = grid[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean[][] visited = new boolean[height][width];
                if (grid[i][j] != 0) max = Math.max(dfs(grid, i, j, visited, height, width), max);
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int row, int col, boolean[][] visited, int height, int width) {
        visited[row][col] = true;
        int add = 0;

        if (row - 1 >= 0 && !visited[row - 1][col] && grid[row - 1][col] != 0) add = Math.max(add, dfs(grid, row - 1, col, visited, height, width));
        if (row + 1 < height && !visited[row + 1][col] && grid[row + 1][col] != 0) add = Math.max(add, dfs(grid, row + 1, col, visited, height, width));
        if (col - 1 >= 0 && !visited[row][col - 1] && grid[row][col - 1] != 0) add = Math.max(add, dfs(grid, row, col - 1, visited, height, width));
        if (col + 1 < width && !visited[row][col + 1] && grid[row][col + 1] != 0) add = Math.max(add, dfs(grid, row, col + 1, visited, height, width));
        visited[row][col] = false;
        return grid[row][col] + add;
    }

}
