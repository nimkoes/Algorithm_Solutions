package com.tistory.xxxelppa.level1;

public class _add_the_number_of_digits {
    public int solution(int n) {
        int answer = 0;
        int mod = 100000000;
        for (; n > 0; n %= mod, mod /= 10) answer += n / mod;
        return answer;
    }
}
