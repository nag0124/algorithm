package leetcode;

import java.util.Arrays;

public class L2285MaximumTotalImportanceOfRoads {

    public long maximumImportance(int n, int[][] roads) {
        int[] cnt = new int[n];
        for (int[] road : roads) {
            cnt[road[0]]++;
            cnt[road[1]]++;
        }
        long ans = 0;
        long val = 1;

        Arrays.sort(cnt);

        for (int i : cnt) {
            ans += i * val;
            val++;
        }
        return ans;
    }

}
