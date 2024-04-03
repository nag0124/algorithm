package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L76MinimumWindowSubstringTest {

    @Test
    void minWindow() {
        // given
        L76MinimumWindowSubstring solution = new L76MinimumWindowSubstring();
        String s = "a";
        String t = "b";

        // when
        String answer = solution.minWindow(s, t);

        // then
        assertThat(answer).isEqualTo("");
    }

}
