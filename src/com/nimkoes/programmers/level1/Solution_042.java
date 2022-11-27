package com.nimkoes.programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution_042 {
    // 각 수포자에 대한 찍기 패턴 저장
    int[][] pattern = new int[][]{
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };
    int[] pattern_size = new int[]{pattern[0].length, pattern[1].length, pattern[2].length};

    public int[] solution(int[] answers) {
        int[] answer;

        // 수포자별 자신의 패턴으로 찍어 맞춘 점수를 저장할 score 배열
        int[] score = new int[pattern.length];
        List<Integer> list = new ArrayList<>();

        int loopCnt = answers.length;
        for (int i = 0; i < loopCnt; ++i) {
            // 찍은 답과 실제 답이 같은 경우, 해당 수포자의 점수를 1 증가
            if (getAnswwerNo(0, i, answers[i])) ++score[0];
            if (getAnswwerNo(1, i, answers[i])) ++score[1];
            if (getAnswwerNo(2, i, answers[i])) ++score[2];
        }

        // 현재 최고 점수 계산
        int max = score[0];
        if (max < score[1]) max = score[1];
        if (max < score[2]) max = score[2];

        // 최고 점수와 같은 수포자 번호 list에 추가 (최고 점수의 동점자 계산)
        for (int i = 0; i < 3; ++i) if (score[i] == max) list.add(i + 1);

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; ++i) answer[i] = list.get(i);

        return answer;
    }

    /*
     * p : 수포자 번호
     * qNo : 문제 번호
     * correct : 실제 정답 번호
     */
    public boolean getAnswwerNo(int p, int qNo, int correct) {

        // 찍은 답과 실제 정답이 같은지 비교한 결과를 반환
        return (pattern[p][qNo % pattern_size[p]] == correct);
    }
}
