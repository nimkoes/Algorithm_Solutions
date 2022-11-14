package com.nimkoes.level0;

public class Solution_073 {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() / n + (my_str.length() % n == 0 ? 0 : 1)];
        for (int i = 0, startPos = 0; i < answer.length; ++i) answer[i] = my_str.substring(startPos, Math.min(startPos += n, my_str.length()));
        return answer;
    }
}
