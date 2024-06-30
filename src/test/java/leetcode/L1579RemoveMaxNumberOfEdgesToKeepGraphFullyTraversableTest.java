package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1579RemoveMaxNumberOfEdgesToKeepGraphFullyTraversableTest {

    @Test
    void maxNumEdgesToRemove() {
        // given
        L1579RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable solution = new L1579RemoveMaxNumberOfEdgesToKeepGraphFullyTraversable();
        int n = 4;
        int[][] edges = {{3,1,2},{3,2,3},{1,1,3},{1,2,4},{1,1,2},{2,3,4}};

        // when
        int ans = solution.maxNumEdgesToRemove(n, edges);

        // then
        assertThat(ans).isEqualTo(2);
    }

}
