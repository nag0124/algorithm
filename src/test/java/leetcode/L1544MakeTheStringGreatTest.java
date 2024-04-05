package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1544MakeTheStringGreatTest {

    @Test
    void makeGood() {
        // given
        L1544MakeTheStringGreat solution = new L1544MakeTheStringGreat();
        String s = "leEeetcode";

        // when
        String answer = solution.makeGood(s);

        // then
        assertThat(answer).isEqualTo("leetcode");
    }

}
