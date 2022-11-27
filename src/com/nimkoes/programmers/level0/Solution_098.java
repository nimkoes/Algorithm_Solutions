package com.nimkoes.programmers.level0;

import java.util.Arrays;

public class Solution_098 {
    public int solution(int[][] board) {
        int answer = 0;

        int index = 0;
        int size = board.length;
        int[][] cp = new int[size][size];
        for (int[] rows : board) cp[index++] = Arrays.copyOf(rows, size);

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (board[i][j] == 0) continue;
                updateBoard(cp, i, j);
            }
        }

        for (int[] n : cp) {
            for (int m : n) {
                if (m == 0) ++answer;
            }
        }

        return answer;
    }

    private void updateBoard(int[][] board, int x, int y) {
        int size = board.length;

        for (int i = x - 1; i <= x + 1; ++i) {
            if (i < 0 || i >= size) continue;

            for (int j = y - 1; j <= y + 1; ++j) {
                if (j < 0 || j >= size) continue;

                board[i][j] = 1;
            }
        }
    }
}
