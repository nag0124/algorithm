package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L78Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());

        for (int num : nums) {
            int size = answer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> add = new ArrayList<>(answer.get(i));
                add.add(num);
                answer.add(add);
            }
        }
        return answer;
    }

}
