package com.nimkoes.leetcode.medium;

public class Solution_013 {
    public int triangularSum(int[] nums) {
        int size = nums.length;
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = 0; j < size - 1; ++j) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
            --size;
        }
        return nums[0] % 10;
    }
}

/* result summary
Runtime: 73ms, faster than 82.63% of Count Number of Find Triangular Sum of an Array.
Memory Usage: 43.3MB, less than 85.30% of Count Number of Find Triangular Sum of an Array.
 */

