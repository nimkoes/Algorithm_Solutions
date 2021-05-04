package com.tistory.xxxelppa.level1;

import java.util.Arrays;

public class _place_them_in_descending_whole_number_order {
    public long solution(long n) {
        long answer = 0;
        char[] c = String.valueOf(n).toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < c.length; ++i) answer += (c[i] - 48) * Math.pow(10, i);
        return answer;
    }
}
