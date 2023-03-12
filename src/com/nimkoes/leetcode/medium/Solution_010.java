package com.nimkoes.leetcode.medium;

import java.util.Arrays;

public class Solution_010 {
    public int maxCoins(int[] piles) {
        Arrays.parallelSort(piles);

        int result = 0, size = piles.length;
        int[] newPiles = Arrays.copyOfRange(piles, size / 3, size);
        for (int i = 0; i < newPiles.length; i += 2) result += newPiles[i];

        return result;
    }
}

/* result summary
Runtime: 32 ms, faster than 58.44% of Java online submissions for Maximum Number of Coins You Can Get.
Memory Usage:  51.5 MB, less than 34.80% of Java online submissions for Maximum Number of Coins You Can Get.
 */

