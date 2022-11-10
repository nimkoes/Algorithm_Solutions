package com.nimkoes.level0;

public class Solution_035 {
    public int[] solution(int n) {
        int[] answer = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];
        for (int i = 1, j = 0; i <= n; i += 2, ++j) {
            answer[j] = i;
        }
        return answer;
    }
}
