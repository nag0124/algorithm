package leetcode;

public class L2226MaximumCandiesAllocatedToKChildren {

    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for (int candy : candies) {
            sum += candy;
        }
        if (sum < k) return 0;
        long max = sum / k;

        long left = 1;
        long right = max;
        int ans = 1;
        while (left <= right) {
            long quote = 0;
            long mid = (left + right) / 2;

            for (int candy : candies) {
                quote += candy / mid;
            }
            if (quote >= k) {
                ans = (int) mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

}
