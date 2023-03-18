package com.nimkoes.leetcode.medium;

import java.util.Arrays;

public class Solution_011 {
    public int maximumXOR(int[] nums) {
        return Arrays.stream(nums).reduce(0, (x, y) -> x | y);
    }
}

/* result summary
Runtime: 5ms, faster than 15.26% of Java online submissions for Maximum XOR After Operations.
Memory Usage: 54.1MB, less than 17.71% of Java online submissions for Maximum XOR After Operations.
 */

