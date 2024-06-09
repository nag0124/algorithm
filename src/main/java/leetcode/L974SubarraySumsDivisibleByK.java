package leetcode;

public class L974SubarraySumsDivisibleByK {

    public int subarraysDivByK(int[] nums, int k) {
        int[] cnt = new int[k];
        cnt[0]++;
        int sum = 0, rem;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rem = ((sum % k) + k) % k;
            cnt[rem]++;
        }
        for (int num : cnt) {
            ans += (num * (num - 1)) / 2;
        }
        return ans;
    }

}
