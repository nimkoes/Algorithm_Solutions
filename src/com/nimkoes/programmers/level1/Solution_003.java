package com.nimkoes.programmers.level1;

public class Solution_003 {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) answer -= number;
        return answer;
    }
}
