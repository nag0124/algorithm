package leetcode;

public class L41FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        if (nums.length == 1) {
            if (nums[0] == 1) return 2;
            else return 1;
        }

        int pointer = 0;
        while (pointer < nums.length) {
            int correctIndex = nums[pointer] - 1;

            if (correctIndex != pointer && correctIndex >= 0 && correctIndex < nums.length &&
                    nums[correctIndex] != nums[pointer]) {
                int temp = nums[pointer];
                nums[pointer] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else pointer++;
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) return j + 1;
        }
        return nums.length + 1;
    }

}
