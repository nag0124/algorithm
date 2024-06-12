package leetcode;

public class L75SortColors {

    public void sortColors(int[] nums) {
        int[] cnt = new int[3];
        for (int num : nums) cnt[num]++;
        int i = 0;

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < cnt[j]; k++) {
                nums[i] = j;
                i++;
            }
        }
    }

}
