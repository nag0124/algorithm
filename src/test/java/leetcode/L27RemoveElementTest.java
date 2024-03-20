package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L27RemoveElementTest {

    @Test
    void removeElement() {
        // given
        L27RemoveElement solution = new L27RemoveElement();

        // when
        int answer = solution.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2);

        // then
        assertThat(answer).isEqualTo(5);
    }

}
