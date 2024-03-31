package leetcode;

public class L2444CountSubarraysWIthFixedBounds {

    public long countSubarrays(int[] nums, int minK, int maxK) {
        int max = -1, min = -1, out = -1;
        long counts = 0L;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < minK || num > maxK) {
                out = i;
                continue;
            }
            if (num == minK) min = i;
            if (num == maxK) max = i;
            counts += Math.max(0L, Math.min(min, max) - out);
        }
        return counts;
    }

}
