package leetcode;

public class L2582PassThePillow {

    public int passThePillow(int n, int time) {
        int quo = time / (n - 1);
        int rem = time % (n - 1);

        if ((quo & 1) == 0) {
            return rem + 1;
        }
        return n - rem;
    }

}
