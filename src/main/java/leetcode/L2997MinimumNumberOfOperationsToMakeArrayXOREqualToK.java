package leetcode;

public class L2997MinimumNumberOfOperationsToMakeArrayXOREqualToK {

    public int minOperations(int[] nums, int k) {
        int xor = 0;
        int ans = 0;

        for (int num : nums) {
            xor = xor ^ num;
        }
        xor = xor ^ k;

        while (xor != 0) {
            ans += xor & 1;
            xor = xor >> 1;
        }
        return ans;
    }

}
