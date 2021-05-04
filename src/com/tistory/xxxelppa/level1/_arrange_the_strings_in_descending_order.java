package com.tistory.xxxelppa.level1;

import java.util.Arrays;

public class _arrange_the_strings_in_descending_order {
    public String solution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new StringBuilder(new String(c)).reverse().toString();
    }
}
