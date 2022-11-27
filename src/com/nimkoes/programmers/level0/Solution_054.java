package com.nimkoes.programmers.level0;

public class Solution_054 {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String age_string = String.valueOf(age);

        for (char elem : age_string.toCharArray()) {
            sb.append((char) (elem + ('a' - '0')));
        }

        return sb.toString();
    }
}
