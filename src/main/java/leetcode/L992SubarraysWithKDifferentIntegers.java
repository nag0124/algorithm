package leetcode;

public class L992SubarraysWithKDifferentIntegers {

    public int subarraysWithKDistinct(int[] nums, int k) {
        int countsLessThanK = subarraysWithLessThanK(nums, k);
        int countsLessThanKMinusOne = subarraysWithLessThanK(nums, k - 1);

        return countsLessThanK - countsLessThanKMinusOne;
    }

    private int subarraysWithLessThanK(int[] nums, int k) {
        int[] freq = new int[nums.length + 1];
        int left = 0, counts = 0, currNum = 0;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            if (freq[num]++ == 0) currNum++;

            while (currNum > k) {
                if (--freq[nums[left++]] == 0) currNum--;
            }
            counts += right - left + 1;
        }
        return counts;
    }

}
