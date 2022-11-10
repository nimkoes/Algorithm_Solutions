package com.nimkoes.level0;

public class Solution_040 {
    public int solution(String my_string) {
        int answer = 0;
        String s = my_string.replaceAll("[a-zA-Z]", "");
        for (int elem : s.toCharArray()) answer += elem - 48;
        return answer;
    }
}
