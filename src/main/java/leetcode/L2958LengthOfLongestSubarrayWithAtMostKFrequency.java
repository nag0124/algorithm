package leetcode;

import java.util.HashMap;
import java.util.Map;

public class L2958LengthOfLongestSubarrayWithAtMostKFrequency {

    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        int answer = 0;

        for (int left = 0, right = 0; right < nums.length; right++) {
            int num = nums[right];
            counts.put(num, counts.getOrDefault(num, 0) + 1);

            while (counts.get(num) > k) {
                counts.put(nums[left], counts.get(nums[left]) - 1);
                left++;

            }
            answer = Math.max(answer, (right - left + 1));
        }
        return answer;
    }

}
