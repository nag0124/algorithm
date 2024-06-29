package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L2192AllAncestorsOfANodeInADirectedAcyclicGraphMedium {

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<>(n);
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) ans.add(new ArrayList());
        for (int i = 0; i < n; i++) graph.add(new ArrayList());
        for (int[] edge : edges) graph.get(edge[0]).add(edge[1]);

        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            for (int g : graph.get(i)) {
                dfs(i, g, graph, ans, visited);
            }
        }
        for (List<Integer> l : ans) l.sort(Integer::compareTo);
        return ans;
    }

    private void dfs(int par, int chi, List<List<Integer>> graph, List<List<Integer>> ans, boolean[] visited) {
        if (visited[chi]) return;

        visited[chi] = true;
        ans.get(chi).add(par);
        for (int i : graph.get(chi)) {
            dfs(par, i, graph, ans, visited);
        }
    }

}
