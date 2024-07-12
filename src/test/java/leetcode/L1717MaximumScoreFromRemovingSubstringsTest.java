package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1717MaximumScoreFromRemovingSubstringsTest {

    @Test
    void maximumGain() {
        // given
        L1717MaximumScoreFromRemovingSubstrings solution = new L1717MaximumScoreFromRemovingSubstrings();
        String s = "cdbcbbaaabab";
        int x = 4;
        int y = 5;

        // when
        int ans = solution.maximumGain(s, x, y);

        // then
        assertThat(ans).isEqualTo(19);

    }

}
