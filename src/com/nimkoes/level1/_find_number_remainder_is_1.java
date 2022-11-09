package com.nimkoes.level1;

public class _find_number_remainder_is_1 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; ++i) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
