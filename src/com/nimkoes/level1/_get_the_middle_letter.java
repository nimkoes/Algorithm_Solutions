package com.nimkoes.level1;

public class _get_the_middle_letter {
    public String solution(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}
