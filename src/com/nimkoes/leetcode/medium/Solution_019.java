package com.nimkoes.leetcode.medium;

public class Solution_019 {
    public boolean stoneGame(int[] piles) {

        // return true; // alice 는 절대 지지 않는다..

        int head = 0, tail = piles.length - 1;
        int alice = 0, bob = 0;

        for (int i = 0; i < piles.length / 2; i++) {
            alice += Math.max(piles[head], piles[tail]);
            bob += Math.min(piles[head], piles[tail]);
            ++head;
            --tail;
        }

        return alice > bob;
    }
}

/* result summary
Runtime: 0ms, faster than 100% of Stone Game.
Memory Usage: 40.6MB, less than 58.54% of Stone Game.
 */
