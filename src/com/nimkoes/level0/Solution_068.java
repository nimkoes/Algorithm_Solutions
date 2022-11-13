package com.nimkoes.level0;

import java.util.Arrays;

public class Solution_068 {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = -1, diff = Integer.MAX_VALUE;

        boolean isUpdated = false;
        for (int elem : array) {
            if (diff > (diff = Math.abs(elem - n))) {
                answer = elem;
                isUpdated = true;
            }
            if (!isUpdated) break;
            isUpdated = false;
        }
        return answer;
    }
}
