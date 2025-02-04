package leetcode;

public class L1800MaximumAscendingSubarraySum {

    public int maxAscendingSum(int[] nums) {
        int ans = 0;
        int tmp = 0;
        int prev = 0;
        int ahead = 0;

        for (int i = 0; i < nums.length; i++) {
            ahead = nums[i];

            if (ahead > prev) tmp += ahead;
            else tmp = ahead;

            ans = Math.max(tmp, ans);
            prev = ahead;
        }
        return ans;
    }

}
