package com.nimkoes.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class Solution_012 {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(getReverse(num));
        }
        return set.size();
    }

    private int getReverse(int num) {
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        return result;
    }
}

/* result summary
Runtime: 70ms, faster than 89.31% of Count Number of Distinct Integers After Reverse Operations.
Memory Usage: 62.5MB, less than 61.28% of Count Number of Distinct Integers After Reverse Operations.
 */

