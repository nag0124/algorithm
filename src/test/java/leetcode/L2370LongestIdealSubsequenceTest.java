package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L2370LongestIdealSubsequenceTest {

    @Test
    void longestIdealString() {
        // given
        L2370LongestIdealSubsequence solution = new L2370LongestIdealSubsequence();
        String s = "eduktdb";
        int k = 15;

        // when
        int answer = solution.longestIdealString(s, k);

        // then
        assertThat(answer).isEqualTo(5);
    }

}
