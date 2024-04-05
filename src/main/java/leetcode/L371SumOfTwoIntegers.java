package leetcode;

public class L371SumOfTwoIntegers {

    public int getSum(int a, int b) {
        int and = a & b;
        int xor = a ^ b;

        while (and != 0) {
            and = and << 1;
            int temp = and;
            and = temp & xor;
            xor = temp ^ xor;
        }
        return xor;
    }

}
