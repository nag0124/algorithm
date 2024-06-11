package leetcode;

public class L1122RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnt = new int[1001];
        for (int i : arr1) cnt[i]++;
        int[] ans = new int[arr1.length];
        int idx = 0;

        for (int i : arr2) {
            while (cnt[i] > 0) {
                ans[idx] = i;
                idx++;
                cnt[i]--;
            }
        }
        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i] > 0) {
                ans[idx] = i;
                idx++;
                cnt[i]--;
            }
        }
        return ans;
    }

}
