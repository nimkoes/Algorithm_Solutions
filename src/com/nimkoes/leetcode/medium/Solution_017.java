package com.nimkoes.leetcode.medium;

public class Solution_017 {
    public void rotate(int[][] matrix) {
        int N = matrix.length;

        // 주대각선 대칭 행렬
        for (int i = 0; i < N; ++i) {
            for (int j = i; j < N; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 좌우 대칭 행렬
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N - j - 1];
                matrix[i][N - j - 1] = temp;
            }
        }
    }
}

/* result summary
Runtime: 0ms, faster than 100% of Rotate Image.
Memory Usage: 42.3MB, less than 81.29% of Rotate Image.
 */
