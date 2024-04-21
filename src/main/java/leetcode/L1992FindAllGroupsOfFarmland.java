package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L1992FindAllGroupsOfFarmland {

    public int[][] findFarmland(int[][] land) {
        List<int[]> l = new ArrayList<>();
        int[] edge;

        for (int r = 0; r < land.length; r++) {
            for (int c = 0; c < land[0].length; c++) {
                if (land[r][c] == 1) {
                    edge = findEdge(land, r, c);

                    for (int y = r; y <= edge[0]; y++) {
                        for (int x = c; x <= edge[1]; x++) {
                            land[y][x] = 0;
                        }
                    }
                    l.add(new int[]{r, c, edge[0], edge[1]});
                }
            }
        }

        return l.toArray(new int[l.size()][]);
    }

    private int[] findEdge(int[][] land, int r, int c) {
        int x = c;
        int y = r;

        while (y + 1 < land.length && land[y + 1][c] == 1) {
            y++;
        }
        while (x + 1 < land[0].length && land[r][x + 1] == 1) {
            x++;
        }
        return new int[]{y, x};
    }

}
