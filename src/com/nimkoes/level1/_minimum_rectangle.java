package com.nimkoes.level1;

public class _minimum_rectangle {
    public int solution(int[][] sizes) {
        final int LEFT = 0, RIGHT = 1;
        int w = -1, h = -1;

        for (int[] size : sizes) {
            if (size[LEFT] > size[RIGHT]) {
                w = Math.max(w, size[LEFT]);
                h = Math.max(h, size[RIGHT]);
            } else {
                w = Math.max(w, size[RIGHT]);
                h = Math.max(h, size[LEFT]);
            }
        }

        return w * h;
    }
}
