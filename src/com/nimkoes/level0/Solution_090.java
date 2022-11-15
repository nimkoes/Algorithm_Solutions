package com.nimkoes.level0;

import java.util.stream.IntStream;

public class Solution_090 {
    public int[] solution(int[] numlist, int n) {

        Integer[] sorted = IntStream.of(numlist).boxed().sorted((num1, num2) -> {
            int num1_abs = Math.abs(num1 - n);
            int num2_abs = Math.abs(num2 - n);

            if (num1_abs == num2_abs) {
                if (num1 > num2) return -1;
                else if (num1 < num2) return 1;
            } else {
                return num1_abs - num2_abs;
            }

            return 0;
        }).toArray(Integer[]::new);

        int[] answer = new int[sorted.length];
        for (int i = 0; i < answer.length; i++) answer[i] = sorted[i];

        return answer;
    }
}
