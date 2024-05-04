package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L881BoatsToSavePeopleTest {

    @Test
    void numRescueBoats() {
        // given
        L881BoatsToSavePeople solution = new L881BoatsToSavePeople();
        int[] people = {2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10};
        int limit = 50;

        // when
        int answer = solution.numRescueBoats(people, limit);

        // then
        assertThat(answer).isEqualTo(3);
    }

}
