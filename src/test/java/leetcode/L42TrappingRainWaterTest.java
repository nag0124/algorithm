package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L42TrappingRainWaterTest {

    @Test
    void trap() {
        // given
        L42TrappingRainWater solution = new L42TrappingRainWater();
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};

        // when
        int answer = solution.trap(height);

        // then
        assertThat(answer).isEqualTo(6);
    }

}
