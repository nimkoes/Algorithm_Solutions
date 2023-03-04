package com.nimkoes.leetcode.medium;

import java.util.Arrays;

public class Solution_008 {
    public int minOperations(int[][] grid, int x) {
        int[] myGrid = flatGrid(grid);
        Arrays.sort(myGrid);
        return operate(myGrid, x);
    }

    private int operate(int[] sortedGrid, int x) {
        int count = 0, midElem = sortedGrid[sortedGrid.length / 2];

        for (int elem : sortedGrid) {
            int abs = Math.abs(midElem - elem);
            if (abs % x != 0) return -1;

            count += abs / x;
        }

        return count;
    }

    private int[] flatGrid(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[] result = new int[row * col];

        int index = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                result[index++] = grid[i][j];
            }
        }

        return result;
    }
}

/* result summary
Runtime: 43 ms, faster than 62.86% of Java online submissions for Minimum Operations to Make a Uni-Value Grid.
Memory Usage: 70.4 MB, less than 56.19% of Java online submissions for Minimum Operations to Make a Uni-Value Grid.
 */

