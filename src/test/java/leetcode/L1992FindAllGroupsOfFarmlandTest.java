package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L1992FindAllGroupsOfFarmlandTest {

    @Test
    void findFarmland() {
        // given
        L1992FindAllGroupsOfFarmland solution = new L1992FindAllGroupsOfFarmland();
        int[][] land = new int[][]{{0, 1}, {1, 0}};

        // when
        int[][] answer = solution.findFarmland(land);

        // then
        assertThat(answer).isEqualTo(new int[][]{{0,1,0,1},{1,0,1,0}});
    }

}
