package com.nimkoes.programmers.level0;

public class Solution_038 {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; ++i) answer *= 2;
        return answer;
    }
}
