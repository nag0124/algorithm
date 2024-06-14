package leetcode;

public class L945MinimumIncrementToMakeArrayUnique {

    public int minIncrementForUnique(int[] nums) {
        int max = 0;
        int len = nums.length;
        for (int num : nums) max = Math.max(max, num);
        int[] freq = new int[max + len];
        for (int i = 0; i < len; i++) freq[nums[i]]++;
        int ans = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 2) {
                int f = freq[i] - 1;
                freq[i + 1] += f;
                ans += f;
            }
        }
        return ans;
    }

}
