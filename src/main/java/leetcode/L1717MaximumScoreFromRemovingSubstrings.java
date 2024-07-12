package leetcode;

public class L1717MaximumScoreFromRemovingSubstrings {

    public int maximumGain(String s, int x, int y) {
        int ans = 0;
        int ac = 0, bc = 0;
        if (y > x) {
            int tmp = x;
            x = y;
            y = tmp;
            s = new StringBuilder(s).reverse().toString();
        }

        for (char c : s.toCharArray()) {
            if (c == 'a') ac++;
            else if (c == 'b') {
                if (ac > 0) {
                    ans += x;
                    ac--;
                } else bc++;
            } else {
                ans += Math.min(ac, bc) * y;
                ac = 0;
                bc = 0;
            }
        }
        ans += Math.min(ac, bc) * y;

        return ans;
    }

}
