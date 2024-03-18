package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L29DivideTwoIntegersTest {

    private L29DivideTwoIntegers solution = new L29DivideTwoIntegers();

    @Test
    void divideTest() {
        // when
        int result = solution.divide(-1010369383, -2147483648);

        // then
        assertThat(result).isEqualTo(0);

    }

}
