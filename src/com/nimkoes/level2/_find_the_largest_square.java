package com.nimkoes.level2;

public class _find_the_largest_square {
    public int solution(int[][] board) {
        int answer = 0;
        
        int rowSize = board.length;
        int colSize = board[0].length;
        
        int[][] memo = new int[2][colSize];
        
        for (int i = 0; i < colSize; ++i) {
            memo[0][i] = board[0][i];
            if (memo[0][i] > answer) answer = memo[0][i];
        }
        
        for (int i = 1; i < rowSize; ++i) {
            for (int j = 0; j < colSize; ++j) {
                if (board[i][j] == 0) memo[1][j] = 0;
                else {
                    if (j == 0) memo[1][j] = 1;
                    else {
                        memo[1][j] = 1;
                        
                        if (memo[1][j - 1] == 0 || memo[0][j] == 0 || memo[0][j - 1] == 0) memo[1][j] = 1;
                        else if (memo[1][j - 1] == memo[0][j] && memo[0][j] == memo[0][j - 1])
                            memo[1][j] = memo[0][j] + 1;
                        else {
                            if (memo[1][j - 1] <= memo[0][j - 1] && memo[1][j - 1] <= memo[0][j])
                                memo[1][j] = memo[1][j - 1] + 1;
                            else if (memo[0][j - 1] <= memo[1][j - 1] && memo[0][j - 1] <= memo[0][j])
                                memo[1][j] = memo[0][j - 1] + 1;
                            else if (memo[0][j] <= memo[0][j - 1] && memo[0][j] <= memo[1][j - 1])
                                memo[1][j] = memo[0][j] + 1;
                        }
                    }
                }
                if (memo[1][j] > answer) answer = memo[1][j];
            }
            System.arraycopy(memo[1], 0, memo[0], 0, colSize);
        }
        
        return answer * answer;
    }
}
