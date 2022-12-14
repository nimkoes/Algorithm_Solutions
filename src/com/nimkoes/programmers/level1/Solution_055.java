package com.nimkoes.programmers.level1;

public class Solution_055 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] memo = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        int i = 0, pos;
        for (char c : s.toCharArray()) {
            pos = c - 'a';
            answer[i] = (memo[pos] == -1 ? -1 : i - memo[pos]);
            memo[pos] = i++;
        }

        return answer;
    }
}
