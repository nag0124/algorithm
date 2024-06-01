package leetcode;

public class L3110ScoreOfAString {

    public int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int ans = 0;
        char bef = chars[0];

        for (int i = 1; i < chars.length; i++) {
            ans += Math.abs(chars[i] - bef);
            bef = chars[i];
        }
        return ans;
    }

}
