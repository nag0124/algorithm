package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class L502IPO {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<Project> l = new ArrayList<>();
        for (int i = 0; i < profits.length; i++) l.add(new Project(profits[i], capital[i]));
        l.sort(Comparator.comparingInt(a -> a.capital));

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int j = 0;
        int size = l.size();
        for (int i = 0; i < k; i++) {
            while (j < size && l.get(j).capital <= w) {
                pq.add(l.get(j).profit);
                j++;
            }
            if (pq.isEmpty()) return w;
            w += pq.poll();
        }
        return w;
    }

    private class Project {

        private int profit;
        private int capital;

        public Project(int profit, int capital) {
            this.profit = profit;
            this.capital = capital;
        }

    }

}
