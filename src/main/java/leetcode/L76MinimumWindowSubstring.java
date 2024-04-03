package leetcode;

public class L76MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty() || s.length() < t.length()) return "";

        char[] sArr = s.toCharArray(), tArr = t.toCharArray();
        int[] map = new int[128];
        int left = 0, count = t.length(), start = -1, len = Integer.MAX_VALUE;

        for (char c : tArr) {
            map[c]++;
        }

        for (int right = 0; right < sArr.length; right++) {
            char sChar = sArr[right];

            if (map[sChar]-- > 0) {
                count--;
            }
            if (count == 0) {
                while (map[sArr[left]] != 0) {
                    map[sArr[left]]++;
                    left++;
                }
                if (right - left + 1 < len) {
                    len = right - left + 1;
                    start = left;
                }
                map[sArr[left]]++;
                left++;
                count++;
            }
        }
        return (start == -1) ? "" : new String(sArr, start, len);
    }

}
