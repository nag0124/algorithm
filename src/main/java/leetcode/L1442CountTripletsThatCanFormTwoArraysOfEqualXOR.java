package leetcode;

import java.util.HashMap;

public class L1442CountTripletsThatCanFormTwoArraysOfEqualXOR {

    public int countTriplets(int[] arr) {
        int answer = 0;
        int xor = 0;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        cnt.put(0, 1);
        HashMap<Integer, Integer> tot = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
            int c = cnt.getOrDefault(xor, 0);
            int t = tot.getOrDefault(xor, 0);

            answer += c * i - t;
            cnt.put(xor, c + 1);
            tot.put(xor, t + i + 1);
        }
        return answer;
    }

}
