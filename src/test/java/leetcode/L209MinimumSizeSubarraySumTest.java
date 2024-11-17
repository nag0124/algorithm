package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L209MinimumSizeSubarraySumTest {

    @Test
    void minSubArrayLen() {
        // given
        L209MinimumSizeSubarraySum solution = new L209MinimumSizeSubarraySum();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        // when
        int answer = solution.minSubArrayLen(target, nums);

        // then
        assertThat(answer).isEqualTo(2);
    }

}
