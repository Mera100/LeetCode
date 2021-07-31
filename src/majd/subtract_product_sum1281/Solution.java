package majd.subtract_product_sum1281;

import java.util.LinkedList;
import java.util.List;

/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.


Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(getDigits(1234));
    }

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        for (int digit : getDigits(n)) {
            product *= digit;
            sum += digit;
        }
        return product - sum;
    }

    private static List<Integer> getDigits(int n) {
        List<Integer> ans = new LinkedList<>();
        while (n > 0) {
            ans.add(n % 10);
            n /= 10;
        }
        return ans;
    }

    public int subtractProductAndSumV2(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}
