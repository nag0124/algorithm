package leetcode;

public class L1652DefuseTheBomb {

    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        if (k == 0) return new int[len];

        int[] answer = new int[len];
        int sum = 0;
        int left, right;
        if (k > 0) {
            right = k;
            left = 1;
        } else {
            right = len - 1;
            left = len + k;
        }

        for (int i = left; i <= right; i++) {
            sum += code[i];
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = sum;
            right = (right + 1) % len;
            sum += code[right];
            sum -= code[left];
            left = (left + 1) % len;
        }
        return answer;
    }

}
