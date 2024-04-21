package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1971FindIfPathExistsInGraphTest {

    @Test
    void validPath() {
        // given
        L1971FindIfPathExistsInGraph solution = new L1971FindIfPathExistsInGraph();
        int n = 10;
        int[][] edges = new int[][]{{2,9},{7,8},{5,9},{7,2},{3,8},{2,8},{1,6},{3,0},{7,0},{8,5}};
        int source = 1;
        int destination = 0;

        // when
        boolean answer = solution.validPath(n, edges, source, destination);

        // then
        assertThat(answer).isFalse();
    }

}
