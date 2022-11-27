package com.nimkoes.programmers.level1;

import java.util.Arrays;

public class Solution_040 {
    public long solution(long n) {
        long answer = 0;
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < c.length; ++i) answer += (c[i] - 48) * Math.pow(10, i);
        return answer;
    }
}
