package leetcode;

public class L409LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] arr = new int['z' - 'A' + 1];
        int answer = 0;
        int odd = 0;

        for (char c : s.toCharArray()) {
            arr[c - 'A']++;
        }
        for (int i : arr) {
            if (i % 2 == 0) answer += i;
            else {
                answer += i - 1;
                odd = 1;
            }
        }
        return answer + odd;
    }

}
