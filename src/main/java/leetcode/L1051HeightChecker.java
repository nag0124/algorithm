package leetcode;

public class L1051HeightChecker {

    public int heightChecker(int[] heights) {
        int[] map = new int[101];
        int cnt = 0;
        int p = 0;
        int ans = 0;

        for (int height : heights) map[height]++;
        for (int height : heights) {
            while (cnt == 0) {
                p++;
                cnt= map[p];
            }
            if (p != height) ans++;
            cnt--;
        }
        return ans;
    }

}
