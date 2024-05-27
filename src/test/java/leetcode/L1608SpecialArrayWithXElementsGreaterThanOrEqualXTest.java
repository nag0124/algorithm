package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1608SpecialArrayWithXElementsGreaterThanOrEqualXTest {

    @Test
    void specialArray() {
        // given
        L1608SpecialArrayWithXElementsGreaterThanOrEqualX solution = new L1608SpecialArrayWithXElementsGreaterThanOrEqualX();
        int[] nums = {0,4,3,0,4};

        // when
        int answer = solution.specialArray(nums);

        // then
        assertThat(answer).isEqualTo(3);

    }

}
