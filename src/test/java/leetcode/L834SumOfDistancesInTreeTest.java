package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L834SumOfDistancesInTreeTest {

    @Test
    void sumOfDistancesInTree() {
        // given
        L834SumOfDistancesInTree solution = new L834SumOfDistancesInTree();
        int n = 6;
        int[][] edges = {{0,1},{0,2},{2,3},{2,4},{2,5}};

        // when
        int[] answer = solution.sumOfDistancesInTree(n, edges);

        // then
        assertThat(answer).isEqualTo(new int[]{8, 12, 6, 10, 10, 10});
    }

}
