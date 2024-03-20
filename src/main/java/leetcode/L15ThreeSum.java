package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L15ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.emptyList();

        Arrays.sort(nums);
        if (nums[0] > 0) return Collections.emptyList();

        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (nums[i] == nums[i - 1]) continue;

            int first = nums[i];
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int leftValue = nums[left], rightValue = nums[right];
                int sum =  leftValue + rightValue + first;

                if (sum < 0) left++;
                else if(sum > 0) right--;
                else {
                    answer.add(List.of(first, leftValue, rightValue));

                    while (left < right && nums[left] == leftValue) left++;
                    while (left < right && nums[right] == rightValue) right--;
                }
            }
        }
        return answer;
    }

}
