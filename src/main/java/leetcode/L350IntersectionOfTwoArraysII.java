package leetcode;

import java.util.Arrays;

public class L350IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] cnt = new int[1001];
        int[] ans = new int[1001];
        int p = 0;

        for (int i : nums1) cnt[i]++;
        for (int i : nums2) {
            if (cnt[i] > 0) {
                ans[p] = i;
                cnt[i]--;
                p++;
            }
        }
        return Arrays.copyOfRange(ans, 0, p);
    }

}
