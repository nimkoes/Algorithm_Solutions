package com.nimkoes.programmers.level0;

public class Solution_022 {
    public int[] solution(int[] numbers) {
        int size = numbers.length;
        int[] answer = new int[size];
        for (int i = 0; i < size; ++i) answer[i] = numbers[i] * 2;
        return answer;
    }
}
