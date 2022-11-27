package com.nimkoes.programmers.level0;

public class Solution_087 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (String[] users : db) {
            if (id_pw[0].equals(users[0])) {
                if (id_pw[1].equals(users[1])) {
                    answer = "login";
                    break;
                }
                answer = "wrong pw";
            }
        }
        return answer;
    }
}
