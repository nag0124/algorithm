package leetcode;

public class L633SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        long right = (long) (Math.ceil(Math.pow(c, 0.5)));
        long left = 0;
        long sum = 0;

        while (left <= right) {
            sum = right * right + left * left;

            if (sum == c) return true;
            else if (sum < c) left++;
            else right--;
        }
        return false;
    }

}
