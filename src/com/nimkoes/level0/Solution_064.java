package com.nimkoes.level0;

public class Solution_064 {
    public int solution(int n) {
        int answer = 1, i = 1;
        for (; answer <= n; ++i) answer *= i;
        return answer == n ? i - 1 : i - 2;
    }
}
