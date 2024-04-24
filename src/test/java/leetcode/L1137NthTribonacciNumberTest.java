package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1137NthTribonacciNumberTest {

    @Test
    void tribonacci() {
        // given
        L1137NthTribonacciNumber solution = new L1137NthTribonacciNumber();
        int n = 4;

        // when
        int answer = solution.tribonacci(n);

        // then
        assertThat(answer).isEqualTo(4);
    }

}
