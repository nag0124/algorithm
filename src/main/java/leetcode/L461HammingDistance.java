package leetcode;

public class L461HammingDistance {

    public int hammingDistance(int x, int y) {
        int count = 0;
        int common = x ^ y;

        while (common != 0) {
            if (common % 2 == 1) count++;
            common = common >> 1;
        }
        return count;
    }

}
