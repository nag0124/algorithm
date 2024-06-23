package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L1438LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {

    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<int[]> asc = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        PriorityQueue<int[]> desc = new PriorityQueue<>(
                (a, b) -> b[1] - a[1]
        ) ;
        int left = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            asc.add(new int[] {right, nums[right]});
            desc.add(new int[] {right, nums[right]});

            while (desc.peek()[1] - asc.peek()[1] > limit) {
                left = Math.min(asc.peek()[0], desc.peek()[0]);

                while (desc.peek()[0] < left) desc.poll();
                while (asc.peek()[1] < left) asc.poll();
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

}
