package com.nimkoes.leetcode.medium;

public class Solution_018 {
    public int xorBeauty(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }
}

/* result summary
Runtime: 1ms, faster than 100% of Find Xor-Beauty of Array.
Memory Usage: 59.2MB, less than 41.44% of Find Xor-Beauty of Array.
 */
