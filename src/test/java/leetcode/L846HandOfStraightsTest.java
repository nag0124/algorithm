package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L846HandOfStraightsTest {

    @Test
    void isNStraightHand() {
        // given
        L846HandOfStraights solution = new L846HandOfStraights();
        int[] hand = {53,78,62,108,83,56,66,110,49,104,117,123,86,131,94,107,84,103,42,127,100,50,55,97,81,93,71,45,63,39,91,87,129,126,84,125,73,95,116,47,106,52,121,54,38,68,69,76,89,90,57,67,86,114,64,87,79,92,115,60,51,105,132,101,59,130,44,85,80,82,48,65,128,102,74,61,40,46,98,111,109,119,72,43,112,120,58,113,77,88,41,118,75,85,124,122,96,83,99,70};
        int groupSize = 50;

        // when
        boolean answer = solution.isNStraightHand(hand, groupSize);

        // then
        assertThat(answer).isTrue();

    }

}
