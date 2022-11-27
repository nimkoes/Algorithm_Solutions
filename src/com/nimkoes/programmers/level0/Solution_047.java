package com.nimkoes.programmers.level0;

public class Solution_047 {
    public int[] solution(int[] array) {
        int max = -1, index = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }
}
