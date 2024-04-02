package leetcode;

public class L205IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        char[] mp = new char[128];
        boolean[] taken = new boolean[128];

        for (int i = 0; i < arrS.length; i++) {
            int asciiS = (byte) arrS[i];
            int asciiT = (byte) arrT[i];

            if (mp[asciiS] == '\u0000') {
                if (taken[asciiT]) return false;
                mp[asciiS] = arrT[i];
                taken[asciiT] = true;
            } else if (mp[asciiS] != arrT[i]) return false;
        }
        return true;
    }

}
