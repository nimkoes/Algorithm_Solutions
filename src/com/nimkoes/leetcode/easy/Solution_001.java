package com.nimkoes.leetcode.easy;

public class Solution_001 {
    public int minimumCost(int[] cost) {
        sort(cost);

        int size = cost.length;
        int costs = 0;

        for (int i = 0; i < size; ++i) {
            if ((i + 1) % 3 != 0) costs += cost[i];
        }

        return costs;
    }

    private void sort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (array[i] < array[j]) swap(array, i, j);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

/* result summary
Runtime: 4 ms, faster than 80.43% of Java online submissions.
Memory Usage: 41.7 MB, less than 94.35% of Java online submissions.
 */
