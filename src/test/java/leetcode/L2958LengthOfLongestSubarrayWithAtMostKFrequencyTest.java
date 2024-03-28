package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L2958LengthOfLongestSubarrayWithAtMostKFrequencyTest {

    @Test
    void maxSubarrayLengthTest() {
        // given
        L2958LengthOfLongestSubarrayWithAtMostKFrequency solution = new L2958LengthOfLongestSubarrayWithAtMostKFrequency();
        int[] nums = new int[] {1, 2, 3, 1, 2, 3, 1, 2};
        int k = 2;

        // when
        int answer = solution.maxSubarrayLength(nums, k);

        // then
        assertThat(answer).isEqualTo(6);

    }

}
