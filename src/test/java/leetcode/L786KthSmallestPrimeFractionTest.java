package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L786KthSmallestPrimeFractionTest {

    @Test
    void kthSmallestPrimeFraction() {
        // given
        L786KthSmallestPrimeFraction solution = new L786KthSmallestPrimeFraction();
        int[] arr = {1,2,3,5};
        int k = 3;

        // when
        int[] answer = solution.kthSmallestPrimeFraction(arr, k);

        // then
        assertThat(answer).isEqualTo(new int[]{2, 5});

    }

}
