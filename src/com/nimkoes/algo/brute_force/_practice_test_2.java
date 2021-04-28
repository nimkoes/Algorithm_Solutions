package com.nimkoes.algo.brute_force;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _practice_test_2 {

    int[][] pattern = new int[][] {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    int[] pattern_size = new int[] {pattern[0].length, pattern[1].length, pattern[2].length};

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input test case num (1 ~ 2) : ");
        int tcNum = sc.nextInt();

        _practice_test_2 simulate = new _practice_test_2(tcNum);
        int[] result = simulate.solution(simulate.getAnswers());
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public int[] solution(int[] answers) {
        int[] answer;
        int[] score = new int[pattern.length];
        List<Integer> list = new ArrayList<>();

        int loopCnt = answers.length;
        for(int i = 0; i < loopCnt; ++i) {
            if(getAnswwerNo(0, i, answers[i])) ++score[0];
            if(getAnswwerNo(1, i, answers[i])) ++score[1];
            if(getAnswwerNo(2, i, answers[i])) ++score[2];
        }

        int max = score[0];
        if(max < score[1]) max = score[1];
        if(max < score[2]) max = score[2];

        for(int i = 0; i < 3; ++i) if(score[i] == max) list.add(i+1);

        answer = new int[list.size()];

        for(int i = 0; i < answer.length; ++i) answer[i] = list.get(i);

        return answer;
    }

    public boolean getAnswwerNo(int p, int qNo, int correct) {
        return (pattern[p][qNo % pattern_size[p]] == correct);
    }

    /*
     * SET TEST PARAM
     */

    private int[] answers;

    public _practice_test_2(int tcNum) {
        switch (tcNum) {
            case 1:
                answers = new int[] {1, 2, 3, 4, 5};
                break;
            case 2:
                answers = new int[] {1, 3, 2, 4, 2};
                break;
        }
    }

    public int[] getAnswers() {
        return answers;
    }
}