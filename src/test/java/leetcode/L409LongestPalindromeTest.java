package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L409LongestPalindromeTest {

    @Test
    void longestPalindrome() {
        // given
        L409LongestPalindrome solution = new L409LongestPalindrome();
        String s = "abccccdd";

        // when
        int answer = solution.longestPalindrome(s);

        // then
        assertThat(answer).isEqualTo(7);

    }

}
