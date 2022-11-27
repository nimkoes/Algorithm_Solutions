package com.nimkoes.programmers.level0;

public class Solution_075 {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split("[a-z|A-Z]");
        for (String elem : split) if (!"".equals(elem)) answer += Integer.parseInt(elem);
        return answer;
    }
}
