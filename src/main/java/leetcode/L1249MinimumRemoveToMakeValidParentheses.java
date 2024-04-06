package leetcode;

public class L1249MinimumRemoveToMakeValidParentheses {

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int stack = 0, count = 0;

        for (char c : arr) {
            if (c == '(') {
                stack++;
            }
            else if (c == ')' && stack > 0) {
                stack--;
                count++;
            }
        }
        int countCopy = count;
        stack = 0;
        for (char c : arr) {
            if (c == '(') {
                if (count > 0) {
                    count--;
                    stack++;
                    sb.append(c);
                }
                continue;
            }
            if (c == ')') {
                if (countCopy > 0 && stack > 0) {
                    countCopy--;
                    stack--;
                    sb.append(c);
                }
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }

}
