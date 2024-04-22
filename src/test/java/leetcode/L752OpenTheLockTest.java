package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L752OpenTheLockTest {

    @Test
    void openLock() {
        // given
        L752OpenTheLock solution = new L752OpenTheLock();
        String[] deadends = new String[] {"0201","0101","0102","1212","2002"};
        String target = "0202";

        // when
        int answer = solution.openLock(deadends, target);

        // when
        assertThat(answer).isEqualTo(6);
    }

}
