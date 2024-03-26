package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L41FirstMissingPositiveTest {

    @Test
    void firstMissingPositive() {
        // given
        L41FirstMissingPositive solution = new L41FirstMissingPositive();
        int[] nums = new int[] {2, 1};

        // when
        int answer = solution.firstMissingPositive(nums);

        // then
        assertThat(answer).isEqualTo(3);

    }

}
