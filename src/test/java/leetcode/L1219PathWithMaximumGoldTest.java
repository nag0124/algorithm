package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1219PathWithMaximumGoldTest {

    @Test
    void getMaximumGold() {
        // given
        L1219PathWithMaximumGold solution = new L1219PathWithMaximumGold();
        int[][] grid = {{1,0,7,0,0,0},{2,0,6,0,1,0},{3,5,6,7,4,2},{4,3,1,0,2,0},{3,0,5,0,20,0}};

        // when
        int answer = solution.getMaximumGold(grid);

        // then
        assertThat(answer).isEqualTo(60);

    }

}
