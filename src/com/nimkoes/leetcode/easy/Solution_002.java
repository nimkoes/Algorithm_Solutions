package com.nimkoes.leetcode.easy;

public class Solution_002 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; ++i) {
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                --n;
            }
            if (n <= 0) return true;
        }
        return false;
    }
}

/* result summary
Runtime: 1 ms, faster than 100% of Java online submissions.
Memory Usage: 43.5 MB, less than 64.6% of Java online submissions.
 */
