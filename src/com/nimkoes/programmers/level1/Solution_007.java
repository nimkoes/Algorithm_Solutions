package com.nimkoes.programmers.level1;

import java.util.Arrays;

public class Solution_007 {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new StringBuilder(new String(c)).reverse().toString();
    }
}
