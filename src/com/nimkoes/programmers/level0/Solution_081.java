package com.nimkoes.programmers.level0;

public class Solution_081 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        final int UM = board[1] / 2, DM = board[1] / 2 * -1, LM = board[0] / 2 * -1, RM = board[0] / 2;

        for (String input : keyinput) {
            if ("left".equals(input)) {
                if (answer[0] > LM) --answer[0];
            } else if ("right".equals(input)) {
                if (answer[0] < RM) ++answer[0];
            } else if ("up".equals(input)) {
                if (answer[1] < UM) ++answer[1];
            } else {
                if (answer[1] > DM) --answer[1];
            }
        }
        return answer;
    }
}
