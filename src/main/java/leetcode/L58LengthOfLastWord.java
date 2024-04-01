package leetcode;

public class L58LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') len++;
            else if(len > 0) break;
        }
        return len;
    }

}
