package leetcode;

import java.util.Arrays;

public class L1509MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {

    public int minDifference(int[] nums) {
        if (nums.length <= 4) return 0;

        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            ans = Math.min(ans, nums[nums.length - 4 + i] - nums[i]);
        }
        return ans;
    }

}
