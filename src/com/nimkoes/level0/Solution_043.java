package com.nimkoes.level0;

public class Solution_043 {
    public int solution(int[] array) {
        return sort_array(array)[array.length / 2];
    }

    private int[] sort_array(int[] array) {
        int size = array.length;

        int temp;
        for (int i = 0; i < size; ++i) {
            for (int j = i; j < size; ++j) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
