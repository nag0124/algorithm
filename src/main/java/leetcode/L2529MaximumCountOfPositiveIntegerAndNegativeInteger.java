package leetcode;

public class L2529MaximumCountOfPositiveIntegerAndNegativeInteger {

    public int maximumCount(int[] nums) {
        int left = -1;
        int right = nums.length;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) left = i;
            else if (num > 0) {
                right = i;
                break;
            }
        }

        return Math.max(left + 1, nums.length - right);

    }

}
