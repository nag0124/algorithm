package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L912SortAnArrayTest {

    @Test
    void sortArray() {
        // given
        L912SortAnArray solution = new L912SortAnArray();
        int[] nums = {5,1,1,2,0,0};

        // when
        int[] ans = solution.sortArray(nums);

        // then
        assertThat(ans).isEqualTo(new int[]{0,0,1,1,2,5});
    }

}
