package majd.smallerNumberInArray1365;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
 */
class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        Map<Integer, Integer> cache = new HashMap<>();
        int index = 0;
        for (int number : nums) {
            if (cache.containsKey(number)) {
                ans[index] = cache.get(number);
                index++;
                continue;
            }
            int smallerNumbersCounter = 0;
            for (int compareNumber : nums) {
                if (number > compareNumber) {
                    smallerNumbersCounter++;
                }
            }
            cache.put(number, smallerNumbersCounter);
            ans[index] = smallerNumbersCounter;
            index++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
}