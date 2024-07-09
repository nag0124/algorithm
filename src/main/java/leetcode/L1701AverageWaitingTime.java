package leetcode;

public class L1701AverageWaitingTime {

    public double averageWaitingTime(int[][] customers) {
        long tot = 0;
        int start = -1;

        for (int[] arr : customers) {
            int ari = arr[0];
            int cook = arr[1];

            start = Math.max(start, ari) + cook;
            tot += start - ari;

        }
        return (double) tot / customers.length;
    }


}
