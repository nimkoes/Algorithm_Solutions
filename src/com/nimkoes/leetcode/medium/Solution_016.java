package com.nimkoes.leetcode.medium;

public class Solution_016 {
    public int reinitializePermutation(int n) {
        int res = 0, i = 1;
        while (res++ == 0 || i > 1) {
            if (i < n / 2) i *= 2;
            else i = (i - n / 2) * 2 + 1;
        }
        return --res;
    }
}

/* result summary
Runtime: 0ms, faster than 100% of Minimum Number of Operations to Reinitialize a Permutation.
Memory Usage: 39.1MB, less than 94.32% of Minimum Number of Operations to Reinitialize a Permutation.
 */
