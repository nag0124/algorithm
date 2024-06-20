package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1552MagneticForceBetweenTwoBallsTest {

    @Test
    void maxDistance() {
        // given
        L1552MagneticForceBetweenTwoBalls solution = new L1552MagneticForceBetweenTwoBalls();
        int[] position = {1,2,3,4,7};
        int m = 3;

        // when
        int ans = solution.maxDistance(position, m);

        // then
        assertThat(ans).isEqualTo(3);
    }

}
