package leetcode;

public class L209MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int before = 0;

        for (int after = 0; after < nums.length; after++) {
            sum += nums[after];
            while (sum >= target) {
                min = Math.min(min, after - before + 1);
                sum -= nums[before];
                before++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
