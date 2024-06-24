package leetcode;

public class L995MinimumNumberOfKConsecutiveBitFlips {

    public int minKBitFlips(int[] A, int K) {
        int len = A.length, cur = 0, ans = 0;
        int[] isFlipped = new int[len];
        for (int i = 0; i < len; ++i) {
            if (i >= K)
                cur ^= isFlipped[i - K];
            if (cur == A[i]) {
                if (i + K > len)
                    return -1;
                isFlipped[i] = 1;
                cur ^= 1;
                ans++;
            }
        }
        return ans;
    }

}
