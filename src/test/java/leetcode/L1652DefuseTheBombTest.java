package leetcode;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1652DefuseTheBombTest {

    @Test
    void decrypt() {
        // given
        L1652DefuseTheBomb solution = new L1652DefuseTheBomb();
        int[] code = {10,5,7,7,3,2,10,3,6,9,1,6};
        int k = -4;

        // when
        int[] answer = solution.decrypt(code, k);

        // then
        assertThat(answer).isNotNull();
    }

}
