package leetcode;

public class L1790CheckIfOneStringSwapCanMakeStringsEqual {

    public boolean areAlmostEqual(String s1, String s2) {
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        int cnt = 0;
        int j = 0, k = 0;

        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                cnt++;
                if (cnt > 2) {
                    return false;
                }
                else if (cnt == 1) {
                    j = i;
                } else {
                    k = i;
                }
            }
        }
        return charArray1[j] == charArray2[k] && charArray1[k] == charArray2[j];
    }

}
