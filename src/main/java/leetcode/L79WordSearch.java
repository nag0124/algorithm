package leetcode;

public class L79WordSearch {

    public boolean exist(char[][] board, String word) {
        int iLength = board.length;
        int jLength = board[0].length;
        boolean[][] used = new boolean[iLength][jLength];
        char[] wordArr = word.toCharArray();
        boolean answer = false;
        int[] counts = new int[256];

        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                counts[board[i][j]]++;
            }
        }
        for (int i = 0; i < wordArr.length; i++) {
            if (--counts[wordArr[i]] < 0) return false;
        }

        for (int i = 0; i < iLength; i++) {
            for (int j = 0; j < jLength; j++) {
                answer = check(board, i, j, iLength, jLength, used, 0, wordArr);
                if (answer) return true;
            }
        }
        return false;
    }

    private boolean check(char[][] board, int i, int j, int iLength, int jLength, boolean[][] used, int index, char[] wordArr) {
        if (index == wordArr.length) return true;

        if (i < 0 || i >= iLength || j < 0 || j >= jLength || used[i][j] || wordArr[index] != board[i][j])
            return false;

        used[i][j] = true;
        if (check(board, i - 1, j, iLength, jLength, used, index + 1, wordArr)
                || check(board, i + 1, j, iLength, jLength, used, index + 1, wordArr)
                || check(board, i, j - 1, iLength, jLength, used, index + 1, wordArr)
                || check(board, i, j + 1, iLength, jLength, used, index + 1, wordArr)) return true;
        used[i][j] = false;
        return false;
    }

}
