package leetcode;

public class L1791FindCenterOfStarGraph {

    public int findCenter(int[][] edges) {
        int fir = edges[0][0];
        int sec = edges[0][1];

        if (fir == edges[1][0] || fir == edges[1][1]) return fir;
        return sec;
    }

}
