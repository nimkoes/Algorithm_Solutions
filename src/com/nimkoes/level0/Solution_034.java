package com.nimkoes.level0;

public class Solution_034 {
    public int solution(int n) {
        double sqrt = Math.sqrt(n);
        return (int) sqrt == sqrt ? 1 : 2;
    }
}
