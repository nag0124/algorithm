package leetcode;

public class L287FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        boolean[] array = new boolean[100001];

        for (int num : nums) {
            if (array[num]) return num;
            else array[num] = true;
        }
        return 0;
    }

}
