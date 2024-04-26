package leetcode;

public class L2370LongestIdealSubsequence {

    public int longestIdealString(String s, int k) {
        char[] chars = s.toCharArray();
        int[] dp = new int[26];
        int answer = 0;

        for (char c : chars) {
            int i = c - 'a';
            int max = Math.min(i + k, 25);
            int min = Math.max(i - k, 0);
            int len = 0;

            for (; min <= max; min++) {
                len = Math.max(dp[min], len);
            }
            dp[i] = len + 1;
        }

        for (int i : dp) {
            answer = Math.max(answer, i);
        }
        return answer;
    }

}
