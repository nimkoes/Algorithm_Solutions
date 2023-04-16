package com.nimkoes.leetcode.medium;

public class Solution_015 {
    public int countTriplets(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; ++i) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; ++j) {
                if ((temp ^= arr[j]) == 0) result += (j - i);
            }
        }
        return result;
    }
}

/* result summary
Runtime: 1ms, faster than 100% of Count Triplets That Can Form Two Arrays of Equal XOR.
Memory Usage: 40.2MB, less than 67.86% of Count Triplets That Can Form Two Arrays of Equal XOR.
 */

