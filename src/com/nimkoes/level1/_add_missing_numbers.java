package com.nimkoes.level1;

public class _add_missing_numbers {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) answer -= number;
        return answer;
    }
}
