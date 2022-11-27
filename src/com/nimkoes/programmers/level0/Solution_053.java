package com.nimkoes.programmers.level0;

public class Solution_053 {
    public int solution(int num, int k) {
        int answer = -1;

        String num_string = String.valueOf(num);
        int size = num_string.length();
        char[] num_chars = num_string.toCharArray();


        for (int i = 0; i < size; ++i) {
            if(num_chars[i] - 48 == k) return i + 1;
        }

        return answer;
    }
}
