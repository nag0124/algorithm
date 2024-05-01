package leetcode;

public class L2000ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        if (i == -1) return word;

        StringBuilder pf = new StringBuilder(word.substring(0, i + 1));
        return pf.reverse().toString() + word.substring(i + 1);
    }
}
