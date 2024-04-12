package leetcode;

public class L42TrappingRainWater {

    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[left], rightMax = height[right];
        int sum = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                sum += leftMax - height[left];
            }
            else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                sum += rightMax - height[right];
            }
        }
        return sum;
    }

}
