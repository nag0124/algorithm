package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1248CountNumberOfNiceSubarraysTest {

    @Test
    void numberOfSubarrays() {
        // given
        L1248CountNumberOfNiceSubarrays solution = new L1248CountNumberOfNiceSubarrays();
        int[] nums = {1,1,2,1,1};
        int k = 3;

        // when
        int ans = solution.numberOfSubarrays(nums, k);

        // then
        assertThat(ans).isEqualTo(2);
    }

}
