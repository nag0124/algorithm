package leetcode;

public class L1550ThreeConsecutiveOdds {

    public boolean threeConsecutiveOdds(int[] arr) {
        int left = -1;

        for (int right = 0; right < arr.length; right++) {
            if ((arr[right] & 1) == 0) {
                left = right;
            }
            if (right - left == 3) return true;
        }
        return false;
    }

}
