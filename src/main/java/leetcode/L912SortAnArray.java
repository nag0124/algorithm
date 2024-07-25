package leetcode;

public class L912SortAnArray {

    public int[] sortArray(int[] nums) {
        int len = nums.length;
        int[][] arr = new int[len][];
        for (int i = 0; i < len; i++) {
            arr[i] = new int[]{nums[i]};
        }

        for (int i = 1; i < len; i *= 2) {
            for (int j = 0; j < len - i; j += 2 * i) {
                arr[j] = sort(arr[j], arr[j + i]);
            }
        }
        return arr[0];
    }

    private int[] sort(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] sorted = new int[len1 + len2];
        int p1 = 0;
        int p2 = 0;
        int ps = 0;

        while (p1 < len1 && p2 < len2) {
            if (arr1[p1] < arr2[p2]) {
                sorted[ps] = arr1[p1];
                p1++;
            } else {
                sorted[ps] = arr2[p2];
                p2++;
            }
            ps++;
        }
        if (p1 == len1) {
            while (p2 < len2) {
                sorted[ps] = arr2[p2];
                p2++;
                ps++;
            }
        } else {
            while (p1 < len1) {
                sorted[ps] = arr1[p1];
                p1++;
                ps++;
            }
        }
        return sorted;
    }

}
