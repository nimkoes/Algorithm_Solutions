package com.nimkoes.leetcode.medium;

public class Solution_004 {
    public int twoEggDrop(int n) {
        int sum = 0, move = 0;
        while ((sum += move++) < n);
        return --move;
    }
}

/* result summary
Runtime: 1 ms, faster than 71.82% of Java online submissions for Egg Drop With 2 Eggs and N Floors.
Memory Usage: 41 MB, less than 49.63% of Java online submissions for Egg Drop With 2 Eggs and N Floors.
 */

