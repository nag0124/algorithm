package leetcode;

public class L260SingleNumber3 {

    public int[] singleNumber(int[] nums) {
        int[] answer = new int[2];
        int xor = 0;

        for (int num : nums) xor ^= num;
        xor &= -xor;
        for (int num : nums) {
            if ((num & xor) == 0) answer[0] ^= num;
            else answer[1] ^= num;
        }
        return answer;
    }

}
