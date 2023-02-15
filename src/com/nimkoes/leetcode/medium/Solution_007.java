package com.nimkoes.leetcode.medium;

public class Solution_007 {
    public int getSum(int a, int b) {
        int carry;
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}

/* result summary
Runtime: 0 ms, faster than 100% of Java online submissions for Sum of Two Integers.
Memory Usage: 38.8 MB, less than 85.17% of Java online submissions for Sum of Two Integers.
 */

