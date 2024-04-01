package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L239SlidingWindowMaximumTest {

    @Test
    void maxSlidingWindowTest() {
        // given
        L239SlidingWindowMaximum solution = new L239SlidingWindowMaximum();
        int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
        int k = 3;

        // when
        int[] answer = solution.maxSlidingWindow(nums, k);

        // then
        assertThat(answer).isEqualTo(new int[] {3, 3, 5, 5, 6, 7});
    }

}
