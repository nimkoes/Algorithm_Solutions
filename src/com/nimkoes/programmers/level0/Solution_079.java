package com.nimkoes.programmers.level0;

public class Solution_079 {
    public int solution(String my_string) {
        String[] token = my_string.split(" ");
        int answer = Integer.parseInt(token[0]);
        for (int i = 1; i < token.length; i += 2) answer = calc(answer, token[i], Integer.parseInt(token[i + 1]));
        return answer;
    }

    private int calc(int num1, String s, int num2) {
        if ("+".equals(s)) return num1 + num2;
        else return num1 - num2;
    }
}
