package leetcode;

import java.util.Collections;
import java.util.List;

public class L648ReplaceWords {

    public String replaceWords(List<String> dictionary, String sentence) {
        String[] split = sentence.split(" ");
        Collections.sort(dictionary);

        for (int i = 0; i < split.length; i++) {
            for (String root : dictionary) {
                if (split[i].startsWith(root)) {
                    split[i] = root;
                    break;
                }
            }
        }
        return String.join(" ", split);
    }

}
