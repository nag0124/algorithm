package leetcode;

public class L1544MakeTheStringGreat {

    public String makeGood(String s) {
        if (s.isEmpty()) return "";

        char[] sArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c: sArr) {
            if (sb.length() == 0) sb.append(c);
            else if (Math.abs(sb.charAt(sb.length() - 1) - c) == 32) sb.deleteCharAt(sb.length() - 1);
            else sb.append(c);
        }
        return sb.toString();
    }

}
