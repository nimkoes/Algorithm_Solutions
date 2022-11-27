package com.nimkoes.programmers.level1;

public class Solution_004 {
    public int solution(int n) {
        int answer = 0;
        int mod = 100000000;
        for (; n > 0; n %= mod, mod /= 10) answer += n / mod;
        return answer;
    }
}
