package leetcode;

public class L1608SpecialArrayWithXElementsGreaterThanOrEqualX {

    public int specialArray(int[] nums) {
        int len = nums.length;
        int[] cnt = new int[len + 1];
        for (int num : nums) {
            if (num <= len) cnt[num]++;
            else cnt[len]++;
        }
        int sum = 0;

        for (int i = len; i > 0; i--) {
            if (i < cnt[i]) return -1;
            sum += cnt[i];
            if (sum == i) return i;
        }
        return -1;
    }

}
