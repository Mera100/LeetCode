package majd.good_pairs_1512;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

    public static int numIdenticalPairs(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (Integer num : nums) {
            int count = freq.getOrDefault(num, 0);
            freq.put(num, count + 1);
        }
        int goodPairCounter = 0;
        for (HashMap.Entry<Integer, Integer> numFreq : freq.entrySet()
        ) {
            goodPairCounter += (numFreq.getValue() * (numFreq.getValue() - 1)) / 2;
        }
        return goodPairCounter;
    }
}
