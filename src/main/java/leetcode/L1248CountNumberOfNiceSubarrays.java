package leetcode;

public class L1248CountNumberOfNiceSubarrays {

    public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0;
        int cnt = 0;
        int len = nums.length;
        int[] map = new int[len + 1];
        map[0] = 1;

        for (int i = 0; i < len; i++) {
            cnt += nums[i] & 1;
            if (cnt >= k) ans += map[cnt - k];
            map[cnt]++;
        }
        return ans;
    }

}
