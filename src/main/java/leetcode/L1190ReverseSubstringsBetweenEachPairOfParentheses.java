package leetcode;

import java.util.Stack;

public class L1190ReverseSubstringsBetweenEachPairOfParentheses {

    public String reverseParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(ans.length());
            else if (c == ')') {
                int start = stack.pop();
                reverse(ans, start, ans.length() - 1);
            } else ans.append(c);
        }
        return ans.toString();
    }
    private void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }

}
