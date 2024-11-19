package leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class L2461MaximumSumOfDistinctSubarraysWithLengthK {

    public long maximumSubarraySum(int[] nums, int k) {
        if (nums.length < k) return 0;
        int[] map = new int[100000];
        int count = 0;
        long sum = 0;
        long ans = 0;

        for (int i = 0; i < k; i++) {
            int num = nums[i];
            sum += num;
            if (map[num] == 0) count++;
            map[num]++;
        }
        if (count == k) ans = sum;

        for (int i = k; i < nums.length; i++) {
            int after = nums[i];
            int before = nums[i - k];

            sum += after;
            sum -= before;
            map[after]++;
            map[before]--;
            if (map[after] == 1 && before != after) count++;
            if (map[before] == 0) count--;
            if (count == k) ans = Math.max(ans, sum);
            }
        return ans;
    }

}
