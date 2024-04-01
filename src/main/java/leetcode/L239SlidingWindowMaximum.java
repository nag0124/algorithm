package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class L239SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] answer = new int[nums.length - k + 1];
        int left = 0, pointer = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        for (int right = 0; right < nums.length; right++) {
            while (!dq.isEmpty() && dq.peekLast() < nums[right]) dq.removeLast();
            dq.addLast(nums[right]);

            if (right - left + 1 == k) {
                answer[pointer++] = dq.peekFirst();
                if (nums[left++] == dq.peekFirst()) dq.removeFirst();
            }
        }
        return answer;
    }

}
