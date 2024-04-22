package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class L752OpenTheLock {

    public int openLock(String[] deadends, String target) {
        boolean[] checked = new boolean[10000];
        for (String s : deadends) {
            checked[Integer.parseInt(s)] = true;
        }
        if (checked[0]) return -1;
        int[] pow = new int[]{1, 10, 100, 1000};
        Queue<Pair> q = new LinkedList<>();
        int tar = Integer.parseInt(target);

        q.add(new Pair(0, 0));
        checked[0] = true;

        while (!q.isEmpty()) {
            Pair poll = q.poll();
            if (poll.num == tar) return poll.cnt;
            int copy = poll.num;
            int digit = 0;

            while (digit < 4) {
                int remain = copy % 10;

                int plus = (remain == 9) ? poll.num - 9 * pow[digit] : poll.num + pow[digit];
                int minus = (remain == 0) ? poll.num + 9 * pow[digit] : poll.num - pow[digit];
                if (!checked[plus]) {
                    q.add(new Pair(plus, poll.cnt + 1));
                    checked[plus] = true;
                }
                if (!checked[minus]) {
                    q.add(new Pair(minus, poll.cnt + 1));
                    checked[minus] = true;
                }
                digit++;
                copy /= 10;
            }
        }
        return -1;
    }

    private class Pair {

        int num;
        int cnt;

        public Pair(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }

    }

}
