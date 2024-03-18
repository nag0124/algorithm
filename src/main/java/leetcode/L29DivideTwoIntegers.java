package leetcode;

public class L29DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long count = 0;
        boolean isPositive = !((dividend < 0) ^ (divisor < 0));

        Long longDividend = Math.abs((long) dividend);
        Long longDivisor = Math.abs((long) divisor);
        Long subDivisor =  longDivisor;
        int subCount = 1;

        while (longDividend >= subDivisor || subDivisor > longDivisor) {
            if (longDividend < subDivisor && subDivisor > longDivisor){
                subDivisor = longDivisor;
                subCount = 1;
                continue;
            }
            count += subCount;
            longDividend -= subDivisor;
            subDivisor = (subDivisor << 1 < 0) ? subDivisor : subDivisor << 1;
            subCount = subCount << 1;
        }

        if (isPositive) return (int) count;
        else return (int) -count;
    }

}
