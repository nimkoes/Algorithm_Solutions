package com.nimkoes.level0;

import java.util.Arrays;

public class Solution_071 {
    public int[] solution(int[] emergency) {
        int[] temp = emergency.clone();
        Arrays.parallelSort(temp);

        int size = emergency.length, rank = 1;
        int[] answer = new int[size];
        for (int i = size; i > 0; --i) {
            for (int j = 0; j < size; ++j) {
                if (temp[i - 1] == emergency[j]) {
                    answer[j] = rank++;
                    break;
                }
            }
        }
        return answer;
    }
}
