package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L621TaskSchedulerTest {

    @Test
    void leastInterval() {
        // given
        L621TaskScheduler solution = new L621TaskScheduler();

        // when
        int answer = solution.leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2);

        // then
        assertThat(answer).isEqualTo(8);
    }

}
