package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L826MostProfitAssigningWorkTest {

    @Test
    void maxProfitAssignment() {
        // given
        L826MostProfitAssigningWork solution = new L826MostProfitAssigningWork();
        int[] difficulty = {66, 1, 28, 73, 53, 35, 45, 60, 100, 44, 59, 94, 27, 88, 7, 18, 83, 18, 72, 63};
        int[] profit = {66, 20, 84, 81, 56, 40, 37, 82, 53, 45, 43, 96, 67, 27, 12, 54, 98, 19, 47, 77};
        int[] worker = {61, 33, 68, 38, 63, 45, 1, 10, 53, 23, 66, 70, 14, 51, 94, 18, 28, 78, 100, 16};

        // when
        int ans = solution.maxProfitAssignment(difficulty, profit, worker);

        // then
        assertThat(ans).isEqualTo(190);
    }

}
