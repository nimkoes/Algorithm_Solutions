package com.nimkoes.level0;

public class Solution_037 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; ++i) answer += n % i == 0 ? 1 : 0;
        return answer;
    }
}
