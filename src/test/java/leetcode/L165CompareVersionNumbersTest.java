package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L165CompareVersionNumbersTest {

    @Test
    void compareVersion() {
        // given
        L165CompareVersionNumbers solution = new L165CompareVersionNumbers();
        String version1 = "1.01";
        String version2 = "1.001";

        // when
        int answer = solution.compareVersion(version1, version2);

        // then
        assertThat(answer).isEqualTo(0);
    }

}
