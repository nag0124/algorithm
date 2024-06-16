package leetcode;

public class L330PatchingArray {

    public int minPatches(int[] nums, int n) {
        long tar = 1;
        int ans = 0;
        int i = 0;

        while (tar <= n) {
            if (i < nums.length && nums[i] <= tar) {
                tar += nums[i];
                i++;
            } else {
                tar += tar;
                ans++;
            }
        }

        return ans;
    }

}
