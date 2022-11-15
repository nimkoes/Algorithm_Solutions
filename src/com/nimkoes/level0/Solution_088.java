package com.nimkoes.level0;

public class Solution_088 {
    public int[] solution(int[][] score) {
        int size = score.length;
        int[] answer = new int[size];
        int[] temp = new int[size];
        for (int i = 0; i < size; ++i) temp[i] = score[i][0] + score[i][1];

        for (int i = 0; i < size; ++i) {
            answer[i] = 1;
            for (int j = 0; j < size; ++j) {
                if (temp[i] < temp[j]) ++answer[i];
            }
        }

        return answer;
    }
}
