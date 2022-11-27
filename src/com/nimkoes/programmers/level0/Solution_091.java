package com.nimkoes.programmers.level0;

public class Solution_091 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; ++i, ++answer) {
            while (is3x(answer)) ++answer;
        }
        return answer - 1;
    }

    private static boolean is3x(int num) {
        return num % 3 == 0 || String.valueOf(num).contains("3");
    }
}
