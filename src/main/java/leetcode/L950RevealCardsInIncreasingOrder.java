package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class L950RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] answer = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        int pointer = 0;
        for (int i = 0; i < deck.length; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            int index = q.poll();
            answer[index] = deck[pointer];
            if (!q.isEmpty()) q.add(q.poll());
            pointer++;
        }
        return answer;
    }

}
