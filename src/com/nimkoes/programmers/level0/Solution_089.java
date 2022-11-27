package com.nimkoes.programmers.level0;

public class Solution_089 {
    public int solution(int chicken) {
        int answer = 0;
        while (chicken / 10 > 0) {
            answer += chicken / 10;
            chicken = (chicken / 10) + (chicken % 10);
        }
        return answer;
    }
}
