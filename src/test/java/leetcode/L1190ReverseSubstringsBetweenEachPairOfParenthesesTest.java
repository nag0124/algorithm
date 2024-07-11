package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1190ReverseSubstringsBetweenEachPairOfParenthesesTest {

    @Test
    void reverseParentheses() {
        // given
        L1190ReverseSubstringsBetweenEachPairOfParentheses solution = new L1190ReverseSubstringsBetweenEachPairOfParentheses();
        String s = "((eqk((h))))";

        // when
        String ans = solution.reverseParentheses(s);

        // then
        assertThat(ans).isEqualTo("eqkh");

    }

}
