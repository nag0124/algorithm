package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L992SubarraysWithKDifferentIntegersTest {

    @Test
    void subarraysWithKDistinctTest() {
        // given
        L992SubarraysWithKDifferentIntegers solution = new L992SubarraysWithKDifferentIntegers();
        int[] nums = new int[] {1, 2, 1, 2, 3};
        int k = 2;

        // when
        int answer = solution.subarraysWithKDistinct(nums, k);

        // then
        assertThat(answer).isEqualTo(7);
    }

}
