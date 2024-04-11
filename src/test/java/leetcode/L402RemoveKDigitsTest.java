package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L402RemoveKDigitsTest {

    @Test
    void removeKdigits() {
        // given
        L402RemoveKDigits solution = new L402RemoveKDigits();
        String num = "1234567890";
        int k = 9;

        // when
        String answer = solution.removeKdigits(num, k);

        // then
        assertThat(answer).isEqualTo("0");
    }

}
