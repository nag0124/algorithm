package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L165CompareVersionNumbers {

    public int compareVersion(String version1, String version2) {
        int v1Len = version1.length();
        int v2Len = version2.length();
        int i = 0;
        int j = 0;

        while (i < v1Len || j < v2Len) {
            int v1 = 0;
            for (; i < v1Len && version1.charAt(i) != '.'; i++) {
                v1 = v1 * 10 + (version1.charAt(i) - '0');
            }
            i++;

            int v2 = 0;
            for (; j < v2Len && version2.charAt(j) != '.'; j++) {
                v2 = v2 * 10 + (version2.charAt(j) - '0');
            }
            j++;

            if (v1 > v2) return 1;
            if (v1 < v2) return -1;
        }
        return 0;
    }

}
