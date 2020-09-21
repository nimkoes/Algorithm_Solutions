package com.nimkoes.algo.level_1;

import java.util.Stack;

public class _001_pull_out_crane_doll {

    public static void main(String[] ar) {
        _001_pull_out_crane_doll simulate = new _001_pull_out_crane_doll();
        int result = simulate.solution(simulate.getBoard(), simulate.getMoves());
        System.out.println(result);
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        int size = board.length;
        int moveCnt = moves.length;

        for (int move : moves) {
            for (int i = 0; i < size; ++i) {
                if (board[i][move - 1] != 0) {

                    if (basket.size() == 0) {
                        basket.push(board[i][move - 1]);
                    } else {

                        if (basket.lastElement().equals(board[i][move - 1])) {
                            basket.pop();
                            answer += 2;
                        } else {
                            basket.push(board[i][move - 1]);
                        }
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    /*
     * SET TEST PARAM
     */

    private int[][] board;
    private int[] moves;

    public _001_pull_out_crane_doll() {
        board = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };

        moves = new int[] {1, 5, 3, 5, 1, 2, 1, 4};
    }

    public int[][] getBoard() {
        return board;
    }

    public int[] getMoves() {
        return moves;
    }
}