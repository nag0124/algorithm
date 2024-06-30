package leetcode;

public class L1579RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable {

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Graph alice = new Graph(n);
        Graph bob = new Graph(n);
        int used = 0;

        for (int[] edge : edges) {
            if (edge[0] == 3) used += (alice.union(edge[1], edge[2]) | bob.union(edge[1], edge[2]));
        }

        for (int[] edge : edges) {
            int type = edge[0];

            if (type == 1) {
                used += alice.union(edge[1], edge[2]);
            } else if (type == 2) {
                used += bob.union(edge[1], edge[2]);
            }
        }

        if ((alice.tot == 1) && (bob.tot == 1)) return edges.length - used;
        return -1;
    }

    private class Graph {

        private int[] len;
        private int[] origin;
        private int tot;

        private Graph(int n) {
            this.len = new int[n + 1];
            this.origin = new int[n + 1];
            this.tot = n;

            for (int i = 1; i < n + 1; i++) {
                origin[i] = i;
                len[i] = 1;
            }
        }

        private int union(int a, int b) {
            int originA = findOrigin(a);
            int originB = findOrigin(b);

            if (originA == originB) return 0;

            if (len[originA] >= len[originB]) {
                len[originA] += len[originB];
                origin[originB] = originA;
            } else {
                len[originB] += len[originA];
                origin[originA] = originB;
            }
            tot--;
            return 1;
        }

        private int findOrigin(int a) {
            if (origin[a] == a) return a;
            return findOrigin(origin[a]);
        }

    }

}
