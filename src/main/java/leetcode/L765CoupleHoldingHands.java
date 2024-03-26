package leetcode;

public class L765CoupleHoldingHands {

    public int minSwapsCouples(int[] row) {
        if (row.length == 2) return 0;

        int[] pos = new int[row.length];
        for (int i = 0; i < row.length; i++) {
            pos[row[i]] = i;
        }
        int count = 0;

        for (int i = 0; i < row.length; i += 2) {
            int id = row[i];
            int currPair = row[i + 1];

            if (id / 2 != currPair / 2) {
                int pair = (id % 2 == 0) ? id + 1 : id -1;
                int pairPos = pos[pair];

                swap(row, i + 1, pairPos);
                swap(pos, currPair, pair);
                count++;
            }
        }
        return count;
    }

    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
