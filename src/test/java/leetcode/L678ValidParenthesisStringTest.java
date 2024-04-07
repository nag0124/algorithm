package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L678ValidParenthesisStringTest {

    @Test
    void checkValidString() {
        // given
        L678ValidParenthesisString solution = new L678ValidParenthesisString();
        String s = "(((((((()((((((((((((()()()()()()((((((()())()()))))))(())(()))())(((()()(((()((()((())((()(()()(())";

        // when
        boolean answer = solution.checkValidString(s);

        // then
        assertThat(answer).isFalse();
    }

}
