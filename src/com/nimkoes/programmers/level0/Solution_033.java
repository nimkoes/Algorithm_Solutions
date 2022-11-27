package com.nimkoes.programmers.level0;

public class Solution_033 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String elem1 : s1) {
            for (String elem2 : s2) {
                if (elem1.equals(elem2)) {
                    ++answer;
                    break;
                }
            }
        }
        return answer;
    }
}
