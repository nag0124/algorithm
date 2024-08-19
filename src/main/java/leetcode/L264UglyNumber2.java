package leetcode;

public class L264UglyNumber2 {

    public int nthUglyNumber(int n) {
        int[] l = new int[n];
        l[0] = 1;
        int twoN = 2, threeN = 3, fiveN = 5;
        int twoI = 0, threeI = 0, fiveI = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            min = Math.min(twoN, Math.min(threeN, fiveN));
            l[i] = min;

            if (min == twoN) {
                twoI++;
                twoN = 2 * l[twoI];
            }
            if (min == threeN) {
                threeI++;
                threeN = 3 * l[threeI];
            }
            if (min == fiveN) {
                fiveI++;
                fiveN = 5 * l[fiveI];
            }
        }
        return l[n - 1];

    }

}
