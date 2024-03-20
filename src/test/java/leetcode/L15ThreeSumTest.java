package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class L15ThreeSumTest {

    @Test
    void threeSum() {
        // given
        L15ThreeSum threeSum = new L15ThreeSum();

        // when
        List<List<Integer>> answer = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        // then
        assertThat(answer.size()).isEqualTo(2);
    }

}
