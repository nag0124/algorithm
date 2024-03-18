package leetcode;

import java.util.Arrays;

public class L14LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int index = 0; index < Math.min(first.length, last.length); index++) {
            if (first[index] == last[index]) sb.append(first[index]);
            else break;
        }

        return sb.toString();

    }

}
