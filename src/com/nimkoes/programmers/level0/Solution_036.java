package com.nimkoes.programmers.level0;

public class Solution_036 {
    public int solution(int n) {
        int answer = 0;
        for (char c : String.valueOf(n).toCharArray()) answer += (c - '0');
        return answer;
    }
}
