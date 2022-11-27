package com.nimkoes.programmers.level0;

import java.util.Arrays;

public class Solution_057 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int size = numbers.length;
        return Math.max(numbers[0] * numbers[1],
                numbers[size - 1] * numbers[size - 2]);
    }
}
