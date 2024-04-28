package leetcode;

public class L834SumOfDistancesInTree {

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        int[] cnt = new int[n];
        int[][] graph = new int[n][];
        int[] answer = new int[n];
        for (int[] edge : edges) {
            cnt[edge[0]]++;
            cnt[edge[1]]++;
        }
        for (int i = 0; i < n; i++) {
            graph[i] = new int[cnt[i]];
        }
        for (int[] edge : edges) {
            graph[edge[0]][--cnt[edge[0]]] = edge[1];
            graph[edge[1]][--cnt[edge[1]]] = edge[0];
        }
        dfs1(0, -1, cnt, graph, answer);
        dfs2(0, -1, cnt, graph, answer, n);
        return answer;
    }

    private void dfs1(int cur, int parent, int[] cnt, int[][] graph, int[] answer) {
        cnt[cur] = 1;
        for (int child : graph[cur]) {
            if (child != parent) {
                dfs1(child, cur, cnt, graph, answer);
                cnt[cur] += cnt[child];
                answer[cur] += answer[child] + cnt[child];
            }
        }
    }

    private void dfs2(int cur, int parent, int[] cnt, int[][] graph, int[] answer, int n) {
        for (int child : graph[cur]) {
            if (child != parent) {
                answer[child] = answer[cur] + n - 2 * cnt[child];
                dfs2(child, cur, cnt, graph, answer, n);
            }
        }
    }

}
