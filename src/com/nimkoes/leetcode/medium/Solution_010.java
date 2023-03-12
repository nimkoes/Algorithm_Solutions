package com.nimkoes.leetcode.medium;

import java.util.Arrays;

public class Solution_010 {
    public int maxCoins(int[] piles) {
        Arrays.parallelSort(piles);

        int result = 0, size = piles.length;
        for (int i = size - 1; i > size / 3; i -= 2) result += piles[i - 1];

        return result;
    }
}

/* result summary
Runtime: 32 ms, faster than 58.44% of Java online submissions for Maximum Number of Coins You Can Get.
Memory Usage:  50.9 MB, less than 91.48% of Java online submissions for Maximum Number of Coins You Can Get.
 */

