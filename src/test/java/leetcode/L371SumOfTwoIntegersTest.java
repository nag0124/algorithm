package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L371SumOfTwoIntegersTest {

    @Test
    void getSum() {
        // given
        L371SumOfTwoIntegers solution = new L371SumOfTwoIntegers();
        int a = 2;
        int b = 3;

        // when
        int ans = solution.getSum(a, b);

        // then
        assertThat(ans).isEqualTo(5);
    }

}
