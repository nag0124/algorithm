package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1614MaximumNestingDepthOfTheParenthesesTest {

    @Test
    void maxDepth() {
        // given
        L1614MaximumNestingDepthOfTheParentheses solution = new L1614MaximumNestingDepthOfTheParentheses();
        String s = "(1)+((2))+(((3)))";

        // when
        int answer = solution.maxDepth(s);

        // then
        assertThat(answer).isEqualTo(3);
    }

}
