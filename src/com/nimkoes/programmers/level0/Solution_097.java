package com.nimkoes.programmers.level0;

public class Solution_097 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int n = num * (num + 1) / 2;
        int start = (total - n) / num;
        for (int i = 1; i <= num; ++i) answer[i - 1] = start + i;
        return answer;
    }
}
