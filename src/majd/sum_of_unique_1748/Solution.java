package majd.sum_of_unique_1748;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int sumOfUnique(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        int sumOfUniqueNumbers = 0;
        Arrays.stream(nums).forEach(
                num -> {
                    int currentFreq = freq.containsKey(num) ? freq.get(num) + 1 : 1;
                    freq.put(num, currentFreq);
                }
        );

        for (Map.Entry<Integer, Integer> number : freq.entrySet()) {
            if (number.getValue() == 1) {
                sumOfUniqueNumbers += number.getKey();
            }
        }
        return sumOfUniqueNumbers;
    }

}
