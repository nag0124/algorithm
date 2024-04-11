package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class L402RemoveKDigits {

    public String removeKdigits(String num, int k) {
        if (num.length() == k || num.length() == 1) return "0";

        Deque<Character> dq = new ArrayDeque();
        StringBuilder sb = new StringBuilder();
        for (char c : num.toCharArray()) {
            while (!dq.isEmpty() && dq.peekLast() > c && k > 0) {
                dq.pollLast();
                k--;
            }
            dq.add(c);
        }
        while (k > 0) {
            dq.pollLast();
            k--;
        }

        while (!dq.isEmpty()) {
            sb.append(dq.poll());
        }

        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return (sb.length() == 0) ? "0" : sb.toString();
    }

}
