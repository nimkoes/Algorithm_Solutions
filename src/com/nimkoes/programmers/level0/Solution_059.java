package com.nimkoes.programmers.level0;

public class Solution_059 {
    public int solution(int order) {
        int answer = 0;
        char[] order_chars = String.valueOf(order).toCharArray();
        for (char elem : order_chars) {
            if (elem == '3' || elem == '6' || elem == '9') ++answer;
        }
        return answer;
    }
}
