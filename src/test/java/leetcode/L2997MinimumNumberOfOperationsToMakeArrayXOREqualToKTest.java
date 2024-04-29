package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L2997MinimumNumberOfOperationsToMakeArrayXOREqualToKTest {

    @Test
    void minOperations() {
        // given
        L2997MinimumNumberOfOperationsToMakeArrayXOREqualToK solution = new L2997MinimumNumberOfOperationsToMakeArrayXOREqualToK();
        int[] nums = {2,1,3,4};
        int k = 1;

        // when
        int answer = solution.minOperations(nums, k);

        // then
        assertThat(answer).isEqualTo(2);
    }

}
