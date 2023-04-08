package com.nimkoes.leetcode.medium;

public class Solution_014 {
    public int findTheWinner(int n, int k) {
        int winner = 1;
        for (int i = 2; i <= n; ++i) winner = (winner + k - 1) % i + 1;
        return winner;
    }
}

/* result summary
Runtime: 0ms, faster than 100% of Find the Winner of the Circular Game.
Memory Usage: 39.1MB, less than 89.78% of Find the Winner of the Circular Game.
 */

