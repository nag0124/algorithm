package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class L406QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        if (people.length == 1) return people;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ? a[1] - b[1] :  b[0] - a[0]
        );

        Collections.addAll(pq, people);

        List<int[]> answer = new LinkedList<>();

        for (int i = 0; i < people.length; i++) {
            int[] poll = pq.poll();
            answer.add(poll[1], poll);
        }

        return answer.toArray(new int[people.length][2]);
    }

}
