package leetcode;

public class L1482MinimumNumberOfDaysToMakeMBouquets {

    public int minDays(int[] bloomDay, int m, int k) {
        int len = bloomDay.length;
        int left = 0;
        int right = 0;
        for (int i : bloomDay) right = Math.max(right, i);
        int mid;
        int ans = -1;

        while (left <= right) {
            mid = (left + right) / 2;
            int cnt = 0;
            int b = 0;

            for (int i = 0; i < len; i++) {
                while (i != len && bloomDay[i] <= mid) {
                    cnt++;
                    i++;
                }
                b += cnt / k;
                cnt = 0;
            }
            if (b >= m) {
                ans = mid;
                right = mid - 1;
            } else left = mid + 1;
        }
        return ans;
    }

}
