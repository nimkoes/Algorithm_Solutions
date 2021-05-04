package com.tistory.xxxelppa.level1;

public class _n_numbers_spaced_by_x {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; ++i) answer[i - 1] = x * i;
        return answer;
    }
}
