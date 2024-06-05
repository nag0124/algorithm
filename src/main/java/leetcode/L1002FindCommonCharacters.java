package leetcode;

import java.util.ArrayList;
import java.util.List;

public class L1002FindCommonCharacters {

    public List<String> commonChars(String[] words) {
        int[] com = new int[26];
        List<String> answer = new ArrayList<>();

        for (char c : words[0].toCharArray()) com[c - 'a']++;

        for (int i = 1; i < words.length; i++) {
            int[] cnt = new int[26];

            for (char c : words[i].toCharArray()) cnt[c - 'a']++;
            for (int j = 0; j < 26; j++) com[j] = Math.min(com[j], cnt[j]);
        }
        for (int i = 0; i < 26; i++) {
            if (com[i] != 0) {
                int min = com[i];
                char c = (char) ('a' + i);
                while (min > 0) {
                    answer.add(String.valueOf(c));
                    min--;
                }
            }
        }
        return answer;
    }

}
