package leetcode;

public class L2486AppendCharactersToStringToMakeSubsequence {

    public int appendCharacters(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int tLen = tChars.length;
        int iT = 0;

        for (int iS = 0; iS < sChars.length; iS++) {
            if (sChars[iS] == tChars[iT]) iT++;
            if (iT == tLen) break;
        }
        return tLen - iT;
    }

}
