package com.nimkoes.programmers.level0;

public class Solution_031 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (Character elem : my_string.toCharArray()) sb.append(elem.toString().repeat(n));
        return sb.toString();
    }
}
