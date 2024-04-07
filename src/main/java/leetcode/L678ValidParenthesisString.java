package leetcode;

public class L678ValidParenthesisString {

    public boolean checkValidString(String s) {
        int low = 0, high = 0;

        for (char c : s.toCharArray()) {
            high += (c != ')') ? 1 : -1;
            low += (c != '(') ? -1 : 1;
            low = Math.max(low, 0);
            if (high < 0) return false;
        }
        return low == 0;
    }

}
