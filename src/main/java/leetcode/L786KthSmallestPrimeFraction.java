package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class L786KthSmallestPrimeFraction {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        HashMap<Double, int[]> mp = new HashMap<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                mp.put(((double) arr[i] / (double) arr[j]), new int[]{arr[i], arr[j]});
            }
        }
        ArrayList<Double> keys = new ArrayList<>(mp.keySet());
        Collections.sort(keys);

        return mp.get(keys.get(k - 1));
    }

}
