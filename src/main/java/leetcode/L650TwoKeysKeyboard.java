package leetcode;

public class L650TwoKeysKeyboard {

    public int minSteps(int n) {
        if (n == 1) return 0;
        int copy = n;
        int ans = 0;

        for (int i = 2; i <= n; i++) {
            while (copy % i == 0) {
                copy /= i;
                ans += i;
            }
        }
        return ans == 0 ? n : ans;
    }

}
