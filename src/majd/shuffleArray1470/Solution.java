package majd.shuffleArray1470;

import java.util.Arrays;

/*

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int counter = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            ans[i] = nums[counter];
            ans[i + 1] = nums[counter + n];
            counter++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1, 1, 1, 2, 2, 2}, 3)));
    }
}
