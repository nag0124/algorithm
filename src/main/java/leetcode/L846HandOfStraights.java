package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L846HandOfStraights {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;

        Map<Integer, Integer> map = new HashMap<>();
        for (int card : hand) map.put(card, map.getOrDefault(card, 0) + 1);
        Arrays.sort(hand);

        for (int card : hand) {
            if (map.get(card) > 0) {
                for (int i = card; i < card + groupSize; i++) {
                    Integer val = map.get(i);
                    if (val == null || val == 0) return false;
                    else map.put(i, val - 1);
                }
            }
        }
        return true;
    }

}
