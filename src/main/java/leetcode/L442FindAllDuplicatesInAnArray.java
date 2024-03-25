package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class L442FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        if (nums.length == 1) return Collections.emptyList();

        int[] counts = new int[nums.length + 1];
        for (int num : nums) {
            counts[num] += 1;
        }

        List<Integer> duplicates = new ArrayList<>();
        for (int i =1; i < counts.length; i++) {
            if (counts[i] == 2) duplicates.add(i);
        }
        return duplicates;
    }

}
