package com.nimkoes.level1;

public class _the_sum_of_the_factors {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; ++i) if (n % i == 0) answer += i;
        return answer + n;
    }
}
