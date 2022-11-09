package com.nimkoes.level1;

public class _the_sum_between_two_integers {
    public long solution(int a, int b) {
        return ((long) Math.abs(a - b) + 1) * (a + b) / 2;
    }
}
