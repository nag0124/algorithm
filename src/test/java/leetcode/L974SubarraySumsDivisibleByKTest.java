package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L974SubarraySumsDivisibleByKTest {

    @Test
    void subarraysDivByK() {
        // given
        L974SubarraySumsDivisibleByK solution = new L974SubarraySumsDivisibleByK();
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;

        // when
        int answer = solution.subarraysDivByK(nums, k);

        // then
        assertThat(answer).isEqualTo(7);

    }

}
