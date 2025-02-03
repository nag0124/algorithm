package leetcode;

public class L3105LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {

    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0) return 1;
        int prev = nums[0];
        int ans = 1;
        int asc = 1;
        int des = 1;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > prev) {
                asc++;
                des = 1;
            } else if (num < prev) {
                asc = 1;
                des++;
            } else {
                asc = 1;
                des = 1;
            }
            ans = Math.max(ans, Math.max(asc, des));
            prev = num;
        }
        return ans;
    }

}
