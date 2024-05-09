package leetcode;

import java.util.Arrays;

public class L3075MaximizeHappinessOfSelectedChildren {

    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long answer = 0;
        int turn = 0;

        for (int i = happiness.length - 1; i >= happiness.length - k; i--) {
            int hap = happiness[i] - turn;
            if (hap > 0) answer += hap;
            turn++;
        }
        return answer;
    }

}
