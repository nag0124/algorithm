package leetcode;

public class L1052GrumpyBookstoreOwner {

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0;
        int len = customers.length;
        int max = 0;
        int sum;

        for (int i = 0; i < len; i++) {
            ans += customers[i] * (1 - grumpy[i]);
        }
        for (int i = 0; i < minutes; i++) {
            max += customers[i] * grumpy[i];
        }
        sum = max;
        for (int i = minutes; i < len; i++) {
            sum = sum + (customers[i] * grumpy[i]) - (customers[i - minutes] * grumpy[i - minutes]);
            max = Math.max(max, sum);
        }
        return max + ans;
    }

}
