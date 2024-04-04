package leetcode;

public class L1614MaximumNestingDepthOfTheParentheses {

    public int maxDepth(String s) {
        int stack = 0;
        char[] sArr = s.toCharArray();
        int count = 0;

        for (char c : sArr) {
            if (c != '(' && c != ')') continue;
            if (c == '(') {
                stack++;
                count = Math.max(stack, count);
            } else if (stack > 0) {
                stack--;
            }
        }
        return count;
    }

}
