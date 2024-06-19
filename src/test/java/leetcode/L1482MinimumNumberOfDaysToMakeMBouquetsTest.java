package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1482MinimumNumberOfDaysToMakeMBouquetsTest {

    @Test
    void minDays() {
        // given
        L1482MinimumNumberOfDaysToMakeMBouquets solution = new L1482MinimumNumberOfDaysToMakeMBouquets();
        int[] bloomDay = {7,7,7,7,12,7,7};
        int m = 2;
        int k = 3;

        // when
        int ans = solution.minDays(bloomDay, m, k);

        // then
        assertThat(ans).isEqualTo(12);
    }

}
