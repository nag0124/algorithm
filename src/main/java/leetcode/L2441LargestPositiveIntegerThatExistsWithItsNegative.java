package leetcode;

public class L2441LargestPositiveIntegerThatExistsWithItsNegative {

    public int findMaxK(int[] nums) {
        boolean[] cnt = new boolean[2001];

        for (int num : nums) {
            cnt[num + 1000] = true;
        }
        for (int i = 2000; i > 1000; i--) {
            if (cnt[i] && cnt [2000 - i]) return i - 1000;
        } return -1;
    }

}
