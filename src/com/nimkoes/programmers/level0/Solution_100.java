package com.nimkoes.programmers.level0;

public class Solution_100 {
    public int solution(int[][] dots) {
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3])
                || (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2]))) return 1;
        return 0;
    }

    private double getSlope(int[] d1, int[] d2) {
        return (double) (d1[1] - d2[1]) / (double) (d1[0] - d2[0]);
    }
}
