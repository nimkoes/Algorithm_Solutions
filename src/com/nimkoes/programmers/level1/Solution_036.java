package com.nimkoes.programmers.level1;

public class Solution_036 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; ++i) answer[i - 1] = x * i;
        return answer;
    }
}