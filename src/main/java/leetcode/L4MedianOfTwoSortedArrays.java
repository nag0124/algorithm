package leetcode;

import java.util.Arrays;

public class L4MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int pointer = 0;
        for (; pointer < nums1.length; pointer++) nums[pointer] = nums1[pointer];
        for (; pointer < nums.length; pointer++) nums[pointer] = nums2[pointer - nums1.length];

        Arrays.sort(nums);

        if (nums.length % 2 == 0) return (double) (nums[nums.length / 2] + nums[(nums.length / 2) - 1]) / 2;
        else return nums[nums.length / 2];
    }

}
