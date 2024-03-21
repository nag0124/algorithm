package leetcode;

import java.util.Arrays;

public class L621TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        if (tasks.length == 1) return 1;

        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        Arrays.sort(freq);

        int max = freq[freq.length - 1] - 1;
        int idles = max * n;
        for (int i = 0; i < freq.length - 1; i++) {
            idles -= Math.min(freq[i], max);
        }
        return (idles < 0) ?  tasks.length : tasks.length + idles;
    }

}
