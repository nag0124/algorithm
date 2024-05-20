package leetcode;

public class L1863SumOfAllSubsetXORTotals {

    public int subsetXORSum(int[] nums) {
        int or = 0;
        for (int num : nums) or |= num;
        or <<= nums.length - 1;
        return or;
        }

}
