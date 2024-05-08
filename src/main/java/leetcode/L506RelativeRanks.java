package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class L506RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        String[] answer = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            mp.put(score[i], i);
        }
        List<Integer> keys = new ArrayList<>(mp.keySet());
        Collections.sort(keys, Collections.reverseOrder());

        int cnt = 0;
        for (int key : keys) {
            cnt++;
            int v = mp.get(key);

            if (cnt > 3) answer[v] = String.valueOf(cnt);
            else if (cnt == 1) answer[v] = "Gold Medal";
            else if (cnt == 2) answer[v] = "Silver Medal";
            else answer[v] = "Bronze Medal";
        }
        return answer;
    }

}
