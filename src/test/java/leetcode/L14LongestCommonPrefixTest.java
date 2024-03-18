package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L14LongestCommonPrefixTest {

    private final L14LongestCommonPrefix solution = new L14LongestCommonPrefix();

    @Test
    void l14Test() {
        // when
        String answer = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});

        // then
        assertThat(answer).isEqualTo("fl");

    }


}
