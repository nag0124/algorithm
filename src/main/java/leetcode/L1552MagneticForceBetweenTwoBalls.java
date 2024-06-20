package leetcode;

import java.util.Arrays;

public class L1552MagneticForceBetweenTwoBalls {

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int len = position.length;
        int right = (int) Math.ceil(position[len - 1] / (m - 1));
        int left = 1;
        int ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 1;
            int prev = position[0];

            for (int i = 1; i < len; i++) {
                if (position[i] - prev >= mid){
                    cnt++;
                    prev = position[i];
                }
            }
            if (cnt >= m) {
                ans = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        return ans;
    }

}
