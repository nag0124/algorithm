package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1249MinimumRemoveToMakeValidParenthesesTest {

    @Test
    void minRemoveToMakeValid() {
        // given
        L1249MinimumRemoveToMakeValidParentheses solution = new L1249MinimumRemoveToMakeValidParentheses();
        String s = "a)b(c)d";

        // when
        String answer = solution.minRemoveToMakeValid(s);

        // then
        assertThat(answer).isEqualTo("ab(c)d");
    }

}
