package com.tistory.xxxelppa.level0;

public class Solution_001 {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            if (b.matches("(aya|ye|woo|ma)+")) ++answer;
        }
        return answer;
    }
}
