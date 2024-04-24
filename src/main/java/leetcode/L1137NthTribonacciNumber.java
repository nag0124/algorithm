package leetcode;

public class L1137NthTribonacciNumber {

    public int tribonacci(int n) {
        int[] mp = new int[Math.max(3, n + 1)];
        mp[0] = 0;
        mp[1] = 1;
        mp[2] = 1;
        if (n <= 2) return mp[n];

        for (int i = 3; i < n + 1; i++) {
            mp[i] = mp[i - 1] + mp[i - 2] + mp[i - 3];
        }
        return mp[n];
    }

}
