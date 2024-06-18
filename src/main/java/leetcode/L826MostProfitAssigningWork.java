package leetcode;

public class L826MostProfitAssigningWork {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int m = 0;
        for (int i : difficulty) m = Math.max(m, i);
        int[] mp = new int[m + 1];
        for (int i = 0; i < difficulty.length; i++) mp[difficulty[i]] = Math.max(profit[i], mp[difficulty[i]]);

        m = 0;
        int len = mp.length;
        for (int i = 0; i < len; i++) {
            if (m < mp[i]) m = mp[i];
            else mp[i] = m;
        }

        int ans = 0;
        for (int i : worker) {
            if (i >= len) ans += mp[len - 1];
            else ans += mp[i];
        }
        return ans;
    }

}
