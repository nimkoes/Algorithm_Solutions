package com.nimkoes.programmers.level0;

public class Solution_094 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) answer[i] = getResult(quiz[i]);
        return answer;
    }

    private String getResult(String quiz) {
        String[] token = quiz.split(" ");
        String calc = "+".equals(token[1])
                ? String.valueOf(Integer.parseInt(token[0]) + Integer.parseInt(token[2]))
                : String.valueOf(Integer.parseInt(token[0]) - Integer.parseInt(token[2]));

        return calc.equals(token[4]) ? "O" : "X";
    }
}
