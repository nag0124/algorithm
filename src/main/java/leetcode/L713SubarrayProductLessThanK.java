package leetcode;

public class L713SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums.length == 1) {
            if (nums[0] < k) return 1;
            else return 0;
        }

        int prod = 1;
        int left = 0;
        int count = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];

            while (prod >= k && left <= right ) {
                prod /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }

}
