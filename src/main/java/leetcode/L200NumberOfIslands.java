package leetcode;

public class L200NumberOfIslands {

    public int numIslands(char[][] grid) {
        int num = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == '1') {
                    num++;
                    checkIsland(grid, row, col);
                }
            }
        }
        return num;
    }

    private void checkIsland(char[][] grid, int row, int col) {
        grid[row][col] = 'x';

        if (row > 0 && grid[row - 1][col] == '1') checkIsland(grid, row - 1, col);
        if (row < grid.length - 1 && grid[row + 1][col] == '1') checkIsland(grid, row + 1, col);
        if (col > 0 && grid[row][col - 1] == '1') checkIsland(grid, row, col - 1);
        if (col < grid[0].length - 1 && grid[row][col + 1] == '1') checkIsland(grid, row, col + 1);
    }

}
